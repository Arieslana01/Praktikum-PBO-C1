/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : Kucing.java
 * Deskripsi : Kelas yang merepresentasikan objek Kucing sebagai turunan dari Anabul.
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong.");
    }
}