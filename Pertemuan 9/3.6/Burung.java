/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : Burung.java
 * Deskripsi : Kelas yang merepresentasikan objek Burung sebagai turunan dari Anabul.
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit.");
    }
}