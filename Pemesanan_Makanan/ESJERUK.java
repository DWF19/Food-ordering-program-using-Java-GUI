package Pemesanan_Makanan;

public class ESJERUK extends Pemesanan_Makanan{
    public ESJERUK(double jumlah) {
        super(jumlah, 0, 5000);
    }
    public String getMenu() {
        return "Es Jeruk";
    }
}
