/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Supplier;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author QL
 */
public class CustomTableSupplier extends AbstractTableModel{
    private String[] header;
    private int[] indexes;
    private Vector<Supplier> data;
    private int pageSize, pageNo, totalRecords, totalPages;
    private int currentRowIndex;

    public CustomTableSupplier(String[] header, int[] indexes, int pageSize) {
        this.header = header;
        for (int i = 0; i < header.length; i++) {
            this.header[i] = header[i];
        }
        this.indexes = indexes;
        for (int i = 0; i < indexes.length; i++) 
            this.indexes[i] = indexes[i];
        
        this.data = new Vector<Supplier>();
        this.pageNo = 1;
        this.pageSize = pageSize;
    }
    
    public Vector<Supplier> getData() {
        return data;
    }

    public void setData(Vector<Supplier> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return pageSize;
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column) {
        return (column >= 0 && column < header.length)
                ? header[column] : "";
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex >= data.size() ||
                columnIndex < 0 || columnIndex >= indexes.length||
                (currentRowIndex + rowIndex) >= data.size())
            return null;
        Supplier sp = data.get(currentRowIndex + rowIndex);
        switch (indexes[columnIndex]){
            case 0:
                return sp.getSupCode();
            case 1:
                return sp.getSupName();
            case 2:
                return sp.getAddress();
            case 3:
                return sp.isColloborating();
        }
        return null;
    }




    public int getPageNo() {
        return pageNo;
    } 
    
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public int getTotalRecords() {
        return data.size();
    }

    public void setTotalRecords() {
        this.totalRecords = data.size();
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages() {
        this.totalPages = (int) Math.ceil(totalRecords / (double) pageSize);
    }

    public int getCurrentRowIndex() {
        return currentRowIndex;
    }

    public void setCurrentRowIndex() {
            this.currentRowIndex = (pageNo - 1) * pageSize;
    }
    
}
