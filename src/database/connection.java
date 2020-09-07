/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class connection {
    static Connection mysqlconfig;
    static Statement mysqlstm;
    public Connection configDB() {
        try {
            String url = "jdbc:mysql://192.168.64.2:3306/mapas";
            String user = "edidoys";
            String pass = "edidoys";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            mysqlstm = mysqlconfig.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL!\n"+e);
            System.out.println(e);
        }
        return mysqlconfig;
    }
}
