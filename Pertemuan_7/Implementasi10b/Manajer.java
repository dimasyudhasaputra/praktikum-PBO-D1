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