/* 
Tanggal  : 10 Mei 2024
Nama     : Dimas Yudha Saputra 
NIM      : 24060122120025
*/
class Main {
    public static void main(String[] args) {
       // kamus
       Kupu K;
       Data<Kupu> anu;

       // Algoritma
        K = new Ulat();
        
        anu = new Data<>();
        
        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}