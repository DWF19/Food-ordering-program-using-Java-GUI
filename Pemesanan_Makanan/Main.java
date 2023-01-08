package Pemesanan_Makanan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame implements ActionListener{
    static List<Pemesanan_Makanan> listPemesanan = new ArrayList<>();
    static JTable tblPemesanan;
    static JButton btnTambah;
    static JButton btnHapus;
    static JButton btnKeluar;
    static String[] columnNames = {"No.", "Menu", "Jumlah", "Harga Total"};
    static String[][] data = {};

    public Main() {
        setTitle("Pemesanan Makanan");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        tblPemesanan = new JTable(data, columnNames);
        add(new JScrollPane(tblPemesanan), BorderLayout.CENTER);

        btnTambah = new JButton("Tambah");
        btnTambah.addActionListener(this);
        add(btnTambah, BorderLayout.NORTH);

        btnHapus = new JButton("Hapus");
        btnHapus.addActionListener(this);
        add(btnHapus, BorderLayout.WEST);

        btnKeluar = new JButton("Keluar");
        btnKeluar.addActionListener(this);
        add(btnKeluar, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
    private void tambahPemesanan() {
        // Show a dialog box to get the menu, jumlah, and harga from the user
        String menu = JOptionPane.showInputDialog(null, "Menu:");
        String jumlahString = JOptionPane.showInputDialog(null, "Jumlah:");
        String hargaString = JOptionPane.showInputDialog(null, "Harga:");

        // Validate the input
        if (menu == null || menu.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Menu tidak boleh kosong!", "Tambah Pemesanan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (jumlahString == null || jumlahString.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah tidak boleh kosong!", "Tambah Pemesanan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (hargaString == null || hargaString.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong!", "Tambah Pemesanan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Convert the jumlah and harga strings to integers
            int jumlahInt = Integer.parseInt(jumlahString);
            int hargaInt = Integer.parseInt(hargaString);

            // Convert the jumlah and harga integers to doubles
            double jumlah = (double) jumlahInt;
            double harga = (double) hargaInt;

            // Create a new Pemesanan_Makanan object and add it to the list
            Pemesanan_Makanan pm = new Pemesanan_Makanan(jumlah, harga, 0.0, menu);
            listPemesanan.add(pm);

            // Update the table to show the new pemesanan
            updateTable();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Jumlah dan harga harus angka!", "Tambah Pemesanan", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void hapusPemesanan() {
        int index = tblPemesanan.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Tidak ada pemesanan yang dipilih!", "Hapus Pemesanan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        listPemesanan.remove(index);
        updateTable();
    }

    private void updateTable() {
        String[][] data = new String[listPemesanan.size()][4];
        for (int i = 0; i < listPemesanan.size(); i++) {
            Pemesanan_Makanan pm = listPemesanan.get(i);
            data[i][0] = (i + 1) + "";
            data[i][1] = pm.getMenu();
            data[i][2] = pm.getJumlah() + "";
            data[i][3] = "Rp. " + pm.getHargaTotal();
        }
        tblPemesanan.setModel(new DefaultTableModel(data, columnNames));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTambah) {
            tambahPemesanan();
        } else if (e.getSource() == btnHapus) {
            hapusPemesanan();
        } else if (e.getSource() == btnKeluar) {
            System.exit(0);
        }
    }
}