/*
NAMA : DIMAS YUDHA SAPUTRA
NIM : 24060122120025
LAB : PBO D1
PERTEMUAN : 2
*/
public class MOperasipoint {
    public static void main(String args[]) {
        point t1 = new point();
        t1.setAbsis(3);
        t1.setOrdinat(4);

        System.out.println("Titik Awal : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Jarak Pusat Awal : " + t1.getJarakPusat());

        point t2 = new point();
        t2.refleksiX(t1);
        System.out.println(
                "Titik baru setelah refleksi terhadap sumbu-X : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t2.refleksiY(t1);
        System.out.println(
                "Titik baru setelah refleksi terhadap sumbu-Y : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // System.out.println("RefleksiX : " + t1.getRefleksiX());

    }
}
