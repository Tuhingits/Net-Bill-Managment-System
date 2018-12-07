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
public class client {
    String c_name;
    String c_id;
    String c_address;
    String gender;

    public client(String c_name, String c_id, String c_address, String gender) {
        this.c_name = c_name;
        this.c_id = c_id;
        this.c_address = c_address;
        this.gender = gender;
    }

    public String getC_name() {
        return c_name;
    }

    public String getC_id() {
        return c_id;
    }

    public String getC_address() {
        return c_address;
    }

    public String getGender() {
        return gender;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
}

