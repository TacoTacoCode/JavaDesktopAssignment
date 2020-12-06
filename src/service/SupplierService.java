/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entity.Supplier;
import java.sql.*;
import java.util.Vector;
/**
 *
 * @author QL
 */
public class SupplierService {
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433; databaseName=ItemDB; "
                + " user=sa; password=38200283";
    public Connection openConnection() throws Exception{
        Class.forName(driver); //Reflection technique
        return DriverManager.getConnection(url);
    }
    
    public Vector<Supplier> getAllSupplier() throws Exception{
        Vector<Supplier> list = new Vector<>();
        String query = "Select * From Suppliers";
        try (Connection c = openConnection();
             Statement stm = c.createStatement()){
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                String SupCode = rs.getString("SupCode");
                String SupName = rs.getString("SupName");
                String Address = rs.getString("Address");
                boolean colloborating = rs.getBoolean("colloborating");
                list.add(new Supplier(SupCode, SupName, Address, colloborating));
            }           
        } 
        return list;
    }
    public Supplier getSupplierByCode(String SupCode) throws Exception{
        String query = "Select * From Suppliers Where SupCode = ?";
        try(Connection c = openConnection();
            PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, SupCode);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return new Supplier(rs.getString("SupCode"), 
                                rs.getString("SupName"), 
                                rs.getString("Address"), 
                                rs.getBoolean("colloborating"));
            }
        }
        return null;
    }
    
    public int insertSupplier(Supplier sp)throws Exception{
        String query = "Insert into Suppliers Values(?,?,?,?)";
        try (Connection c = openConnection();
             PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, sp.getSupCode());
            pst.setString(2, sp.getSupName());
            pst.setString(3, sp.getAddress());
            pst.setString(4, sp.isColloborating()+"");
            //return an int indicating the numbers of affected rows
            return pst.executeUpdate();
        }
    }
    
    public int updateSupplier(Supplier sp)throws Exception{
        String query = "Update Suppliers Set SupName = ?, Address = ?,"
                + "colloborating = ? Where SupCode = ?";
        try (Connection c = openConnection();
             PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(4, sp.getSupCode());
            pst.setString(1, sp.getSupName());
            pst.setString(2, sp.getAddress());
            pst.setString(3, sp.isColloborating()+"");
            //return an int indicating the numbers of affected rows
            return pst.executeUpdate();
        }
    }
    
    public int removeSupplier(String SupCode) throws Exception{
        String query = "Delete From Suppliers Where SupCode = ?";
        try (Connection c = openConnection();
             PreparedStatement pst = c.prepareStatement(query)){
            pst.setString(1, SupCode);
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
