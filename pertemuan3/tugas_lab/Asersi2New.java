// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1

class Lingkaran {
    private double jariJari;

    // ubah konstruktor
    public Lingkaran() {
        this.jariJari = 1;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // tambahan kode
    public double getJariJari() {
        return this.jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}

public class Asersi2New {
    public static void main(String[] args) {
        // tambahan kode
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(0);
        // double jariJari = -1; {diganti dengan baris di atas}

        assert (lingkaran.getJariJari() > 0) : "jari-jari tidak boleh nol!!!";
        // Lingkaran lingkaran = new Lingkaran(jariJari); {diganti}
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}