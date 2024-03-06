/**
 * File : Angkasial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println("Angka " + angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial angkasial = new AngkaSial();
        try {
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        } catch (AngkaSialException sial) {
            // method getMessage() telah ada pada kelas Exception
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
 * PERTANYAAN 1 : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java
 * diatas dieksekusi?
 * 
 * JAWABAN SOAL 1 : Eksepsi terjadi saat angka = 13, dimana saat program
 * angkasial.cobaAngka(13). Saat eksepsi terjadi maka baris yang dimaksud yaitu
 * System.out.println("Angka " + angka + " bukan angka sial"); TIDAK AKAN
 * DIEKSEKUSI.Program akan masuk ke catch
 * dan akan mengeksekusi code didalamnya dan membuat AngkaSial.java
 * terminated(berhenti).
 * 
 * -----------------------------------------------------------------------------
 * --------------------------------
 * PERTANYAAN 2 : Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * JAWABAN soal 2 : program akan dijalankan secara sequential
 * yaitu,cobaAngka(10) lalu cobaAngka(13). Saat cobaAngka(13) inilah terjadi
 * proses eksepsi. Jenis eksepsi pada program AngkaSial.java ini adalah sama
 * dengan AngkaSialException dimana sama dengan baris ke-21 sehingga baris ke-21
 * akan dieksekusi dimana akan mencetak getMessage dan hati-hati akan
 * memasukkan Angka.
 * 
 */
