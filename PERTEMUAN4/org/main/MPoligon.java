package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegipanjang = new PersegiPanjang(10, 10, 4);
        persegipanjang.printInfo();
        System.out.println("Luas Persegi Panjang :" + persegipanjang.hitungLuas());
        System.out.println(
                "\n================================================================================================================================\n");
        Segitiga segitiga = new Segitiga(5, 10, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}