/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author QL
 */
public class Supplier {
    private String SupCode;
    private String SupName;
    private String Address;
    private boolean colloborating;

    public Supplier(String SupCode, String SupName, String Address, boolean colloborating) {
        this.SupCode = SupCode;
        this.SupName = SupName;
        this.Address = Address;
        this.colloborating = colloborating;
    }

    public String getSupCode() {
        return SupCode;
    }

    public void setSupCode(String SupCode) {
        this.SupCode = SupCode;
    }

    public String getSupName() {
        return SupName;
    }

    public void setSupName(String SupName) {
        this.SupName = SupName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public boolean isColloborating() {
        return colloborating;
    }

    public void setColloborating(boolean colloborating) {
        this.colloborating = colloborating;
    }

    @Override
    public String toString() {
        return "Supplier{" + "SupCode=" + SupCode + ", SupName=" + SupName + ", Address=" + Address + ", colloborating=" + colloborating + '}';
    }
    
}
