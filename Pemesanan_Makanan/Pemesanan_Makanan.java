package Pemesanan_Makanan;

public class Pemesanan_Makanan {
    double jumlah;
    double hargaMakanan;
    double hargaMinuman;
    double hargaTotal;
    String menu;

    public Pemesanan_Makanan(double jumlah, double hargaMakanan, double hargaMinuman, String menu) {
        this.jumlah = jumlah;
        this.hargaMakanan = hargaMakanan;
        this.hargaMinuman = hargaMinuman;
        this.hargaTotal = jumlah * (hargaMakanan + hargaMinuman);
        this.menu = menu;
    }

    public Pemesanan_Makanan(double jumlah, int hargaMakanan, int hargaMinuman) {
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public double getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(double hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public double getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
