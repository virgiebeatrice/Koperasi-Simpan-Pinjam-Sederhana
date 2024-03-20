import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Simpan {
    public String nama;
    public String alamat;
    public String pekerjaan;
    public int simpanan;
    private JTable tab;

    // Inisialisasi ArrayList
    public static ArrayList<Simpan> dataSimpan = new ArrayList<>();

    public static void loadSimpanFromDB() {
        try {
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT * FROM simpan";

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Simpan simpan = new Simpan();
                simpan.nama = rs.getString("nama");
                simpan.alamat = rs.getString("alamat");
                simpan.pekerjaan = rs.getString("pekerjaan");
                simpan.simpanan = rs.getInt("simpanan");

                dataSimpan.add(simpan);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void tampilkanDataSimpan(DefaultTableModel model) {
        model.setRowCount(0); // Menghapus semua baris yang ada pada tabel

        for (Simpan simpan : dataSimpan) {
            model.addRow(new Object[]{simpan.nama, simpan.alamat, simpan.pekerjaan, simpan.simpanan});
        }
    }
}
