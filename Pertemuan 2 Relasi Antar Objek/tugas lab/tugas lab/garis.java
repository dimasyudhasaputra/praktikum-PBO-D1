/*
    NAMA : DIMAS YUDHA SAPUTRA
    NIM : 24060122120025
    LAB : PBO D1
    PERTEMUAN : 2
*/
public class garis {
    // Atribut
    private point titikAwal, titikAkhir;

    // Method
    garis(point a, point b) {
        this.titikAwal = a;
        this.titikAkhir = b;
    }

    garis() {
        // this.titikAwal = new point(titikAwal.getAbsis(), titikAwal.getOrdinat());
        // this.titikAkhir = new point(titikAkhir.getAbsis(), titikAkhir.getOrdinat());
        this(new point(0, 0), new point(1, 1));
        /*
         * titikAwal.setAbsis(0);
         * titikAwal.setOrdinat(0);
         * titikAkhir.setAbsis(0);
         * titikAkhir.setOrdinat(0);
         */
    }

    public void setTitikAwal(point titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(point titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public point getTitikAwal() {
        return this.titikAwal;
    }

    public point getTitikAkhir() {
        return this.titikAkhir;
    }

    public double getPanjang() {
        double selisihX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double selisihY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    public double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        return deltaY / deltaX; // asumsi bahwa deltaX tidak pernah bernilai 0
    }

    public garis getRefleksiYGaris() {
        point titikAwalRefleksi = new point();
        titikAwalRefleksi.getRefleksiY(titikAwal);
        point titikAkhirRefleksi = new point();
        titikAkhirRefleksi.getRefleksiY(titikAkhir);
        return new garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    public boolean isTegakLurus(garis g) {
        return (this.getGradien() * g.getGradien()) == -1;
    }
}
