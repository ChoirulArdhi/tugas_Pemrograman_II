package JBDC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

public class Koneksi {

    public static void main(String[] args) {
        
        
        Koneksi tes = new Koneksi();
        tes.Koneksi();
        
    }
    
    Connection conn = null;
    
    String statusKoneksi; 
    public void Koneksi() {
       
        try {
             String DB_URL = "jdbc:mysql://localhost/mahasiswa";
             String USER = "root";
             String PASS = "";
              Class.forName ("com.mysql.cj.jdbc.Driver");
             conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
             statusKoneksi = "Berhasil Koneksi";
        } catch (Exception e) {
             statusKoneksi = "Koneksi Gagal";
        }
    }

}