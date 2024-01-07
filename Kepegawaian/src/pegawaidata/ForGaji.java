/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawaidata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ForGaji {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String id;
    public String nama;
    public String  jabatan;  
    public String gaji;
    public String hari_kerja;
    public String total;
    
     public void simpan()throws SQLException{
        conn = DatabaseKoneksi.getKoneksi();
        sql = "INSERT INTO addgaji(id,nama,jabatan,gaji,hari_kerja,total)VALUES(?,?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        ps.setString(2, nama);
        ps.setString(3, jabatan);  //koding untuk tambah data ke database
        ps.setString(4, gaji);
        ps.setString(5, hari_kerja);
        ps.setString(6, total);
        ps.execute();
        ps.close();
        
    }
     public void edit()throws SQLException{
        conn = DatabaseKoneksi.getKoneksi();
        sql = "UPDATE addgaji set nama=?,jabatan=?,gaji=?,hari_kerja=?,total=? where id=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setString(2, jabatan);  //koding untuk tambah data ke database
        ps.setString(3, gaji);
        ps.setString(4, hari_kerja);
        ps.setString(5, total);
        ps.setString(6, id);
        ps.executeUpdate();
        ps.close();
        
    }
     
       public void hapus()throws SQLException{
       conn = DatabaseKoneksi.getKoneksi();
       String sql = "DELETE from addgaji where id=?";
       try{
        ps = conn.prepareStatement(sql);  //koding untuk  hapus data ke database
        ps.setString(1, id);
        ps.execute();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
        public ResultSet TableUpdate()throws SQLException {
       conn = DatabaseKoneksi.getKoneksi();
       sql = "select id,nama,jabatan,gaji,hari_kerja,total from addgaji";
       ps = conn.prepareStatement(sql); 
       rs = ps.executeQuery();  //koding untuk menampilkan data dari database ke tabel
       return rs;
    }
}
