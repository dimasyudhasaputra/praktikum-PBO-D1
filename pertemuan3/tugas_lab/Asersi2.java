// NAMA : DIMAS YUDHA SAPUTRA
// NIM  : 24060122120025
// LAB  : D1

// class lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// class Asersi 2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
/*
 * PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2diatas?
 * 
 * JAWABAN : Secara konsep masih ada yang kurang tepat pada program
 * Asersi2, dimana letak
 * kesalahannya adalah dideklarasikan double jariJari = 0, namun jariJari adalah
 * atribut private di dalam class lingkaran dimana tidak bisa diakses oleh class
 * lainnya dan juga objek lingkaran belum
 * dibuat terlebih dahulu. Seharusnya untuk
 * mendapatkan nilai jariJari bisa menggunakan methods public SETTER MAUPUN
 * GETTER di dalam class lingkaran.
 * Code yang benar bisa dilihat di file Asersi2New.java
 */
