/* 
 * Tanggal  : 2 Mei 2024
 * Nama     : Dimas Yudha Saputra 
 * NIM      : 24060122120025
*/

public class Programmer extends Pegawai {

    private int bonus;

    public Programmer(String nama) {
        super(nama);
        this.bonus = 450000;
    }

    public void tampilData() {
        System.out.println("Nama : " + getNama() + ", Gaji pokok : " + getGajiPokok());
        System.out.println("Bonus  : " + bonus);
    }

}