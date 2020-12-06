/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entity.Item;
import java.sql.*;
import java.util.Vector;
/**
 *
 * @author QL
 */
public class ItemService {
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433; databaseName=ItemDB; "
                + " user=sa; password=38200283";
    public Connection openConnection() throws Exception{
        Class.forName(driver); //Reflection technique
        return DriverManager.getConnection(url);
    }
    
    public Vector<Item> getAllItem() throws Exception{
        Vector<Item> list = new Vector<>();
        String query = "Select * From Items";
        try (Connection c = openConnection();
             Statement stm = c.createStatement()){
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                String itemCode = rs.getString("itemCode");
                String itemName = rs.getString("itemName");
                String supCode = rs.getString("supCode");
                String unit = rs.getString("unit");
                int price = rs.getInt("price");
                boolean supplying = rs.getBoolean("supplying");
                list.add(new Item(itemCode, itemName, supCode, unit, String.valueOf(price), supplying));
            }           
        } 
        return list;
    }
    public Item getItemByCode(String itemCode) throws Exception{
        String query = "Select * From Items Where itemCode = ?";
        try(Connection c = openConnection();
            PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, itemCode);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return new Item(rs.getString("itemCode"), 
                                rs.getString("itemName"), 
                                rs.getString("supCode"), 
                                rs.getString("unit"), 
                                String.valueOf(rs.getInt("price")), 
                                rs.getBoolean("supplying"));
            }
        }
        return null;
    }
    
    public int insertItem(Item it)throws Exception{
        String query = "Insert into Items Values(?,?,?,?,?,?)";
        try (Connection c = openConnection();
             PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, it.getItemCode());
            pst.setString(2, it.getItemName());
            pst.setString(3, it.getSupCode());
            pst.setString(4, it.getUnit());
            pst.setInt(5, Integer.parseInt(it.getPrice()));
            pst.setString(6, it.isSupplying()+"");
            //return an int indicating the numbers of affected rows
            return pst.executeUpdate();
        }
    }
    
    public int updateItem(Item it)throws Exception{
        String query = "Update Items Set itemName = ?, supCode = ?, unit = ?,"
                + "price = ?, supplying = ? Where itemCode = ?";
        try (Connection c = openConnection();
             PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, it.getItemName());
            pst.setString(2, it.getSupCode());
            pst.setString(3, it.getUnit());
            pst.setInt(4, Integer.parseInt(it.getPrice()));
            pst.setString(5, it.isSupplying()+"");            
            pst.setString(6, it.getItemCode());
            return pst.executeUpdate();
        }
    }
    
    public int removeItem(String itemCode) throws Exception{
        String query = "Delete From Items Where itemCode = ?";
        try (Connection c = openConnection();
             PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, itemCode);
            return pst.executeUpdate();
        }
    }
    
    public boolean checkLogin(String userName, String password) throws Exception{
        String sql = "Select * From Login "
                + "Where Username = ? And Password = ?";
        try(Connection c = openConnection();
            PreparedStatement pst = c.prepareStatement(sql)){
            pst.setString(1, userName);
            pst.setString(2, password);
            return pst.executeQuery().next();
        }
    }
}
