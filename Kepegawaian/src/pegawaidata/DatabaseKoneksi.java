/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawaidata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DatabaseKoneksi {
     private static Connection koneksi;
    public static Connection getKoneksi() throws SQLException {
        if (koneksi==null){
            try {
                String DB="jdbc:mysql://localhost:3306/Data_pegawai";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi= DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return koneksi;
}
    
}
