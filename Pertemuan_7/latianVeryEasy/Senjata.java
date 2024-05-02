/* 
 * Tanggal  : 2 Mei 2024
 * Nama     : Dimas Yudha Saputra 
 * NIM      : 24060122120025
*/

public class Senjata {
    private String bunyi;
    private int peluru; 

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    } 

    public String getBunyi() {
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public void menembak(){
        if (getPeluru()>0){
            System.out.println(getBunyi());
            setPeluru(getPeluru()-1);
            System.out.println("Sisa Peluru : "+ getPeluru());
        }else{
            System.out.println("Gagal tembak , Peluru Habis");
        }
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

}