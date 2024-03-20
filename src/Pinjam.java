
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pinjam {
    public String nama;
    public String alamat;
    public String pekerjaan;
    public int pinjaman;
    public String angsuran;
    private JTable tab2;
    
    // Inisialisasi ArrayList
    public static ArrayList<Pinjam> dataPinjam = new ArrayList<>();

    public static void loadPinjamFromDB() {
        try {
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT * FROM pinjam";

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pinjam pinjam = new Pinjam();
                pinjam.nama = rs.getString("nama");
                pinjam.alamat = rs.getString("alamat");
                pinjam.pekerjaan = rs.getString("pekerjaan");
                pinjam.pinjaman = rs.getInt("pinjaman");
                pinjam.angsuran = rs.getString("angsuran");

                dataPinjam.add(pinjam);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    

        // Method untuk menampilkan data pinjam pada tabel
    public static void tampilkanDataPinjam(DefaultTableModel model) {
        model.setRowCount(0); // Menghapus semua baris yang ada pada tabel

        for (Pinjam pinjam : dataPinjam) {
            model.addRow(new Object[]{pinjam.nama, pinjam.alamat, pinjam.pekerjaan, pinjam.pinjaman, pinjam.angsuran});
        }
    }
}
