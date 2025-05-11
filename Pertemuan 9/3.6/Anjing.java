/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : Anjing.java
 * Deskripsi : Kelas yang merepresentasikan objek Anjing sebagai turunan dari Anabul.
 */

public class Anjing extends Anabul { 
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk.");
    }
}