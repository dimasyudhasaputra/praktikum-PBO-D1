/* 
 * Tanggal  : 2 Mei 2024
 * Nama     : Dimas Yudha Saputra 
 * NIM      : 24060122120025
*/

public class PegawaiDanGaji {

    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}