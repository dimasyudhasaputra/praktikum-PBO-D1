/* 
 * Tanggal  : 2 Mei 2024
 * Nama     : Dimas Yudha Saputra 
 * NIM      : 24060122120025
*/

public class KontrolSenjata {
    private Senjata senjata;

    KontrolSenjata(Senjata s){
        senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+senjata.getPeluru());
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");

        if(this.isAdaPeluru()){
            for (int i = 1; i <= jumlah; i++) {
                if (senjata.getPeluru() <= 0) {
                    System.out.println("Gagal tembak, Peluru Habis");
                }else{
                    senjata.setPeluru(  senjata.getPeluru() - 1);
                    System.out.println(senjata.getBunyi());
                }
            }
            System.out.println(">> Peluru sisa: " +    senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis"); 
        }
    }

    public void menusuk(){
        if(senjata.isMenusuk()){
            System.out.println("Senjata sudah menusuk");
        } else {
            senjata.setMenusuk(true);
            System.out.println("Senjata menusuk");
        }
    }

    public void pasangBayonet(){
        if(senjata.isMenusuk()){
            System.out.println("Senjata sudah terpasang bayonet");
        } else {
            senjata.setMenusuk(true);
            System.out.println("Senjata terpasang bayonet");
        }
    }
}