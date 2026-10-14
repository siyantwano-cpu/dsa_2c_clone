/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.msconnectaccess;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author CL2-PC
 */
import java.sql.DriverManager;
public class MsConnectAccess {

    public static Connection conn() {
        try {
            String url = "jdbc:ucanaccess://C:\\Users\\CL2-PC\\Documents/jaymarkhampaslupa.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

        
    }
}
