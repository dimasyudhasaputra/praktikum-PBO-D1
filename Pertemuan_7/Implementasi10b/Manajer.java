/* 
 * Tanggal  : 2 Mei 2024
 * Nama     : Dimas Yudha Saputra 
 * NIM      : 24060122120025
*/

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama) {
        super(nama);
        this.tunjangan = 700000;
    }

    
    public void tampilData() {
        System.out.println("Nama : " + getNama() + ", Gaji pokok : " + getGajiPokok());
        System.out.println("Tunjangan  : " + tunjangan);
    }
}