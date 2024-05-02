public class Pegawai {
    private String nama;
    private int gajiPokok;

    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 5000000;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + getNama());
        System.out.println("Gaji Pokok : " + getGajiPokok());
    }
}