package pboif2.pkg10119065.latihan49.biayaemaskwin;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program hitung emas kawin
 *                         dengan objek
 */
public class EmasKawin {
    private double berat,harga;
    
    public EmasKawin(double berat, double harga)
    {
        this.berat = berat;
        this.harga = harga;
    }
    
    public double getHarga()
    {
        return harga;
    }
    public double getBerat()
    {
        return berat;
    }
    
    public void totalHarga()
    {
        System.out.println("Total Harga Yang Harus Di Bayar : Rp. "+ (berat*harga));
    }
}
