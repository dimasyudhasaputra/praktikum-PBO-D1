/*
        * NAMA : DIMAS YUDHA SAPUTRA
        * NIM : 24060122120025
        * LAB : PBO D1
        * PERTEMUAN : 
*/
public class mgaris {
        public static void main(String args[]) {
                garis t1 = new garis();
                point p1 = new point(0, -2);
                point p2 = new point(3, 2);
                t1.setTitikAwal(p1);
                t1.setTitikAkhir(p2);

                System.out.println(
                                "TitikAwal : (" + t1.getTitikAwal().getAbsis() + " , " + t1.getTitikAwal().getOrdinat()
                                                + ")");

                System.out.println(
                                "TitikAkhir : (" + t1.getTitikAkhir().getAbsis() + " , "
                                                + t1.getTitikAkhir().getOrdinat() + ")");

                System.out.println("getPanjang : " + t1.getPanjang());
                System.out.println("getGradien : " + t1.getGradien());

                garis t2 = new garis();
                t1.getRefleksiYGaris();
                System.out.println(
                                "Garis t1 setelah refleksi thd sumbu-Y) :" + "(" + t1.getTitikAwal().getAbsis() + " , "
                                                + t1.getTitikAwal().getOrdinat() + ")"
                                                + "(" + t1.getTitikAkhir().getAbsis() + " , "
                                                + t1.getTitikAkhir().getOrdinat() + ")");

                System.out.println("isTegakLurus : " + t1.isTegakLurus(t2));
        }
}
/*
 * t1.setAbsis(3);
 * t1 .setOrdinat(4);
 * 
 * System.out.println("Titik Awal : (" + t1.getAbsis() + ", " + t1.getOrdinat()
 * + ")");
 * System.out.println("Jarak Pusat Awal : " + t1.getJarakPusat());
 * 
 * point t2 = new point();
 * t2.refleksiX(t1);
 * Sys tem.out.println(
 * "Titik baru setelah refleksi terhadap sumbu-X : (" + t1.getAbsis() + ", " +
 * t1.getOrdinat() + ")");
 * t2.refleksiY(t1);
 * System.out.println(
 * "Titik baru setelah refleksi terhadap sumbu-Y : (" + t1.getAbsis() + ", " +
 * t1.getOrdinat() + ")");
 * 
 * // System.out.println("RefleksiX : " + t1.getRefleksiX());
 */