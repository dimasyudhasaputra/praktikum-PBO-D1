import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar hs = new BujurSangkar();
        System.out.print("Masukkan sisi: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + hs.hitungLuas(sisi));
        scan.close(); // Close the Scanner object
    }
}

/*
 * apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi
 * metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
 */

/* JAWAB : 
 Jika kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar, maka akan terjadi kesalahan kompilasi atau ERROR(The type BujurSangkar must implement the inherited abstract method BangunDatar.hitungLuas(double)). 
 Ini karena ketika sebuah kelas mewarisi kelas lain yang memiliki metode abstrak, kelas tersebut harus mengimplementasikan metode-metode abstrak tersebut atau harus dideklarasikan sebagai kelas abstrak juga.
 Jika tidak, saat mencoba untuk membuat objek dari kelas BujurSangkar, akan terjadi kesalahan karena tidak dapat menginstansiasi kelas yang memiliki metode abstrak yang tidak diimplementasikan.

*/