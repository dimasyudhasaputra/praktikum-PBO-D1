/* 
 * Tanggal  : 2 Mei 2024
 * Nama     : Dimas Yudha Saputra 
 * NIM      : 24060122120025
*/

public class Senjata {
    private String bunyi;
    private int peluru; 
    private boolean menusuk;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    } 

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public boolean isMenusuk(){
        return menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}