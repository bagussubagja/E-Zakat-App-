/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.zakat.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bagus
 */
public class KoneksiDB {
    public static Connection koneksi;
    public static Connection configDB() throws SQLException{
            try {//koneksi berhasil
                String alamat_url = "jdbc:mysql://localhost:3306/ezakat_db";
                String user_database = "root";
                String password_database = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());//inti koneksi
                koneksi = DriverManager.getConnection(alamat_url, user_database,password_database);
            } catch (Exception e) {
                //koneksi error
                JOptionPane.showMessageDialog(null,"Konkesi Gagal "+ e.getMessage());
            }
    return koneksi;
}
    public static void main(String[] args) throws SQLException {
        Connection hubung = (Connection)KoneksiDB.configDB();
        hubung.close();
    }
}
