/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        BangunDatarGeneric<Lingkaran> bdg1 = new BangunDatarGeneric<>();
        bdg1.set(new Lingkaran(2));
        System.out.println("Keliling lingkaran: " + bdg1.hitungKeliling());
        System.out.println("Luas lingkaran: " + bdg1.hitungLuas());
        System.out.println("Tipe generic: " + bdg1.get().getClass().getName());

        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<>();
        bdg2.set(new Persegi(4));
        System.out.println("Keliling persegi: " + bdg2.hitungKeliling());
        System.out.println("Luas persegi: " + bdg2.hitungLuas());
        System.out.println("Tipe generic: " + bdg2.get().getClass().getName());

        BangunDatarGeneric<PersegiPanjang> bdg3 = new BangunDatarGeneric<>();
        bdg3.set(new PersegiPanjang(5, 2));
        System.out.println("Keliling persegi panjang: " + bdg3.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdg3.hitungLuas());
        System.out.println("Tipe generic: " + bdg3.get().getClass().getName());

        BangunDatarGeneric<Segitiga> bdg4 = new BangunDatarGeneric<>();
        bdg4.set(new Segitiga(3, 4, 5));
        System.out.println("Keliling segitiga: " + bdg4.hitungKeliling());
        System.out.println("Luas segitiga: " + bdg4.hitungLuas());
        System.out.println("Tipe generic: " + bdg4.get().getClass().getName());
    }
}