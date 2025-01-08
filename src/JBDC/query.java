package JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class query {
    
    private Connection conn;

    // Konstruktor untuk menginisialisasi koneksi
    public query() {
        try {
            // Pastikan JDBC driver sesuai dengan database Anda
            String url = "jdbc:mysql://localhost/mahasiswa"; // Ganti dengan URL database Anda
            String username = "root"; // Ganti dengan username database Anda
            String password = ""; // Ganti dengan password database Anda

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
    
    public void insert(String nim, String nama, String alamat, String jk) {
        // Query INSERT
        String insertQuery = "INSERT INTO IDENTITAS (nim, nama, alamat, gender) VALUES (?, ?, ?, ?)";

        try {
            // Memastikan koneksi tidak null
            if (conn != null) {
                // Membuat PreparedStatement
                PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);

                // Mengisi parameter pada query
                preparedStatement.setString(1, nim); // Untuk nim (string)
                preparedStatement.setString(2, nama); // Untuk nama (string)
                preparedStatement.setString(3, alamat); // Untuk alamat (string)
                preparedStatement.setString(4, jk); // Untuk jenis kelamin (string)

                // Menjalankan query INSERT
                int rowsInserted = preparedStatement.executeUpdate();

                // Menampilkan hasil
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil dimasukkan!");
                } else {
                    System.out.println("Data gagal dimasukkan.");
                }
            } else {
                System.out.println("Koneksi tidak tersedia.");
            }

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat menginsert data: " + e.getMessage());
        }
    }
    
    public void delete(String Nim) {
    try {
        PreparedStatement pst = null;
        String sql = "DELETE FROM mahasiswa.identitas WHERE nim = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, Nim);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public void update(String Nim, String nama, String alamat, String gender) {
    try {
        PreparedStatement pst = null;
        String sql = "UPDATE mahasiswa.identitas SET nama = ?, alamat = ?, gender = ? WHERE nim = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, alamat);
        pst.setString(3, gender);
        pst.setString(4, Nim);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public static void main(String[] args) {
        
    }
}
