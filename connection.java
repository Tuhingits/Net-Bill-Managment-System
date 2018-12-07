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
public class connection {
    
    String cn_id;
    String cn_date;
    String cn_area;

    public connection(String cn_id, String cn_date, String cn_area) {
        this.cn_id = cn_id;
        this.cn_date = cn_date;
        this.cn_area = cn_area;
    }

    public String getCn_id() {
        return cn_id;
    }

    public String getCn_date() {
        return cn_date;
    }

    public String getCn_area() {
        return cn_area;
    }

    public void setCn_id(String cn_id) {
        this.cn_id = cn_id;
    }

    public void setCn_date(String cn_date) {
        this.cn_date = cn_date;
    }

    public void setCn_area(String cn_area) {
        this.cn_area = cn_area;
    }
    
    
    
    
}
