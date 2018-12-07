/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bill.managment;

/**
 *
 * @author TUHIN-BD
 */
public class bill {
    String b_id;
    String b_c_id;
    String date;

    public bill(String b_id, String b_c_id, String date) {
        this.b_id = b_id;
        this.b_c_id = b_c_id;
        this.date = date;
    }

    public String getB_id() {
        return b_id;
    }

    public String getB_c_id() {
        return b_c_id;
    }

    public String getDate() {
        return date;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public void setB_c_id(String b_c_id) {
        this.b_c_id = b_c_id;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
}
