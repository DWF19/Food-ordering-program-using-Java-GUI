package Pemesanan_Makanan;

public class NASIGORENG extends Pemesanan_Makanan{
    public NASIGORENG(double jumlah) {
        super(jumlah, 7000, 0);
    }
    public String getMenu() {
        return "Nasi Goreng";
    }
}
