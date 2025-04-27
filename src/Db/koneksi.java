/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Db;
import java.sql.*;

/**
 *
 * @author yusuf
 */
public class koneksi {
    private Connection conn;
    public Connection openKoneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil connect mysql Driver");        
        } catch (ClassNotFoundException e) {
            System.out.println("Gagal connect Driver : " + e);     
        }
        
        String url = "jdbc:mysql://localhost/latihan";
        
        try {
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil connect DB"); 
        } catch (SQLException e) {
            System.out.println("Gagal connect DB : " + e);  
        }
        return conn;
    }
    
    public void closeKoneksi() throws SQLException{
        try{
            if(conn != null){
                System.out.print("Tutup Koneksi\n");
            }
        }catch(Exception ex){
            System.out.println("Tidak dapat membuka koneksi atau terdapat kesalahan konfigurasi database : " + ex);  
        }
    }
}
