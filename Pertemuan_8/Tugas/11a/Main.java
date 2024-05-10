/* 
Tanggal  : 10 Mei 2024
Nama     : Dimas Yudha Saputra 
NIM      : 24060122120025
*/
class Main {
    public static void main(String[] args) {
        //Kamus
        Kupu K;
        Data<Kupu> anu;

        //Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}