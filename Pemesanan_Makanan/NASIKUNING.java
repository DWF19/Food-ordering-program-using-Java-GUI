package Pemesanan_Makanan;

public class NASIKUNING extends Pemesanan_Makanan{
    public NASIKUNING(double jumlah) {
        super(jumlah, 5000, 0);
    }
    public String getMenu() {
        return "Nasi Kuning";
    }
}
