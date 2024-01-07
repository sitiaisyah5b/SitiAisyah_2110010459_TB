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
public class ForPegawai {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String nop;
    public String nama;
    public String  alamat;  
    public String jenis_kelamin;
    public String nohp;
    public String email;
   
    
     public void simpan()throws SQLException{
        conn = DatabaseKoneksi.getKoneksi();
        sql = "INSERT INTO addpegawai(nop,nama,alamat,jenis_kelamin,nohp,email)VALUES(?,?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nop);
        ps.setString(2, nama);
        ps.setString(3, alamat);  //koding untuk tambah data ke database
        ps.setString(4, jenis_kelamin);
        ps.setString(5, nohp);
        ps.setString(6, email);
        ps.execute();
        ps.close();
        
    }
     
      public void edit()throws SQLException{
        conn = DatabaseKoneksi.getKoneksi();
        sql = "UPDATE addpegawai set nama=?,alamat=?,jenis_kelamin=?,nohp=?,email=? where nop=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setString(2, alamat);
        ps.setString(3, jenis_kelamin); //koding untuk edit data ke database
        ps.setString(4, nohp);
        ps.setString(5, email);
        ps.setString(6, nop);
        ps.executeUpdate();
        ps.close();
        
    }

      
      public void hapus()throws SQLException{
       conn = DatabaseKoneksi.getKoneksi();
       String sql = "DELETE from addpegawai where nop=?";
       try{
        ps = conn.prepareStatement(sql);  //koding untuk  hapus data ke database
        ps.setString(1, nop);
        ps.execute();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
      
      public ResultSet TableUpdate()throws SQLException {
       conn = DatabaseKoneksi.getKoneksi();
       sql = "select nop,nama,alamat,jenis_kelamin,nohp,email from addpegawai";
       ps = conn.prepareStatement(sql); 
       rs = ps.executeQuery();  //koding untuk menampilkan data dari database ke tabel
       return rs;
    }
}
