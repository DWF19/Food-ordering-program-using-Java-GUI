package Pemesanan_Makanan;

public class ESTEH extends Pemesanan_Makanan{
    public ESTEH(double jumlah) {
        super(jumlah, 0, 4000);
    }
    public String getMenu() {
        return "Es Teh";
    }
}
