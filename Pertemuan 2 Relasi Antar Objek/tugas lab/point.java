/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 2
*/
public class point {
    private double x, y;

    // Method
    point() {
        x = 0;
        y = 0;
    }

    point(double a, double b) {
        x = a;
        y = b;
    }

    public void setAbsis(double x) {
        this.x = x;
    }

    public void setOrdinat(double y) {
        this.y = y;
    }

    public double getAbsis() {
        return this.x;
    }

    public double getOrdinat() {
        return this.y;
    }

    public double getJarakPusat() {
        return Math.sqrt(x * x + y * y);
    }

    public void refleksiX(point Titik) {
        Titik.setOrdinat(Titik.getOrdinat() * (-1));
    }

    public void refleksiY(point Titik) {
        Titik.setAbsis(Titik.getAbsis() * (-1));
    }

    public void getRefleksiX(point t) {
        refleksiX(t);
    }

    public void getRefleksiY(point t) {
        refleksiY(t);
    }
}