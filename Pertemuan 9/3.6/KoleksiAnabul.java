/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : KoleksiAnabul.java
 * Deskripsi : Kelas untuk menyimpan koleksi objek Anabul.
 */
public class KoleksiAnabul extends Koleksi<Anabul> {
    public KoleksiAnabul(int size) {
        super(Anabul.class, size);
    }

    public void showAll() {
        for (int i = 0; i < getSize(); i++) {
            Anabul a = getIsi()[i];
            System.out.println("Nama: " + a.getNama());
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}