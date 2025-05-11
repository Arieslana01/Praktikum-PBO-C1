/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : Anabul.java
 * Deskripsi : Kelas yang merepresentasikan objek Anabul (hewan peliharaan).
 */

public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract void gerak();
    public abstract void bersuara();
}