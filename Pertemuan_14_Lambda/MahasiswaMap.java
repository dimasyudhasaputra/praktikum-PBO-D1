// import java.util.HashMap;
// import java.util.Map;
import java.util.*;

public class MahasiswaMap {
    public static void main(String[] args) {
        // Membuat sebuah Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060122120001", "Anies");
        mahasiswa.put("24060122120002", "Prabowo");
        mahasiswa.put("24060122120003", "Ganjar");
        mahasiswa.put("24060122120004", "Agus");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswa.forEach((nim, nama) -> { 
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        } );
    }
}
