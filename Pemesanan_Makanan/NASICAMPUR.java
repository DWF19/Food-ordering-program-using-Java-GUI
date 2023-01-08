package Pemesanan_Makanan;

public class NASICAMPUR extends Pemesanan_Makanan{
    public NASICAMPUR(double jumlah) {
        super(jumlah, 10000, 0);
    }
    public String getMenu() {
        return "Nasi Campur";
    }
}
