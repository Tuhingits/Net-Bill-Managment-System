package net.bill.managment;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Databasehandelar {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Databasehandelar() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:G:\\project\\Net_bill_managment.sqlite");
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }

    }

    public void insertintoadminn(adminn adminn) {
        try {
            String quiry = "insert into adminn values(?,?)";
            pst = conn.prepareStatement(quiry);
            pst.setString(1, adminn.getName());
            pst.setString(2, adminn.getPassword());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Accepted!");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Something went worng!");

        }
    }

    public void insertintoclient(client client) {
        try {
            String quiry = "insert into client values(?,?,?,?)";
            pst = conn.prepareStatement(quiry);
            pst.setString(1, client.getC_name());
            pst.setString(2, client.getC_id());
            pst.setString(3, client.getC_address());
            pst.setString(4, client.getGender());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Your record has been saved!");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Something went worng!");

        }
    }
     public void updateintoclient(String id, client client) {
        String c_id = (id);
        try {
            String sql = "update client set C_id='" + client.getC_id() + "',c_name ='" + client.getC_name() + "',c_adress ='" + client.getC_address() + "' where c_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully update");
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
      public void deleteclient(String id) {

        try {
            String sql = "delete from client where c_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            conn.close();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         }
       public ArrayList<client> getAll_client() throws SQLException {
        ArrayList<client> client_list = new ArrayList<>();

        String query = "select * from client";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            client vehiclesJFrame = new client("abs", "qw", "df","rt");

            vehiclesJFrame.setC_name(rs.getString(1));
            vehiclesJFrame.setC_id(rs.getString(2));
            vehiclesJFrame.setC_address(rs.getString(3));
            vehiclesJFrame.setGender(rs.getString(4));
            client_list.add(vehiclesJFrame);

        }

        return client_list;
    }
    
    
    public void insertintobill( bill  bill) {
        try {
            String quiry = "insert into  bill values(?,?,?)";
            pst = conn.prepareStatement(quiry);
            pst.setString(1,  bill.getB_id());
            pst.setString(2,  bill.getB_c_id());
            pst.setString(3,  bill.getDate());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Your record has been saved!");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Something went worng!");

        }
    }
    public void updateintobill(String id, bill bill) {
        String b_id = (id);
        try {
            String sql = "update bill set b_id='" + bill.getB_id() + "',b_c_id ='" + bill.getB_c_id() + "',b_date ='" + bill.getDate() + "' where b_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully update");
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
     public void deletebill(String id) {

        try {
            String sql = "delete from bill where b_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            conn.close();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         }
      public ArrayList<bill> getAll_bill() throws SQLException {
        ArrayList<bill> bill_list = new ArrayList<>();

        String query = "select * from bill";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            bill vehiclesJFrame = new bill("abs", "qw", "df");

            vehiclesJFrame.setB_id(rs.getString(1));
            vehiclesJFrame.setB_c_id(rs.getString(2));
            vehiclesJFrame.setDate(rs.getString(3));
            bill_list.add(vehiclesJFrame);

        }

        return bill_list;
    }
    
      public void insertintoconnection( connection  connection) {
        try {
            String quiry = "insert into  connection values(?,?,?)";
            pst = conn.prepareStatement(quiry);
            pst.setString(1,  connection.getCn_id());
            pst.setString(2,  connection.getCn_date());
            pst.setString(3,  connection.getCn_area());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Your record has been saved!");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Something went worng!");

        }
    }
    
        public void updateintoconnection(String id, connection connection) {
        String add_id = (id);
        try {
            String sql = "update connection set cn_id='" + connection.getCn_id() + "',cn_date ='" + connection.getCn_date() + "',cn_area ='" + connection.getCn_area() + "' where cn_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully update");
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
         public void deleteconnection(String id) {

        try {
            String sql = "delete from connection where cn_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            conn.close();

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         }
         
             public ArrayList<connection> getAll_connection() throws SQLException {
        ArrayList<connection> connection_list = new ArrayList<>();

        String query = "select * from connection";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            connection vehiclesJFrame = new connection("abs", "qw", "df");

            vehiclesJFrame.setCn_id(rs.getString(1));
            vehiclesJFrame.setCn_date(rs.getString(2));
            vehiclesJFrame.setCn_area(rs.getString(3));
            connection_list.add(vehiclesJFrame);

        }

        return connection_list;
    }
    
    

}
