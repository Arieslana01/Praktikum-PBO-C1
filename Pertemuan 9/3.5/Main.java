/**
 * Nama     : Muhammad Aris Maulana
 * NIM      : 24060123120036
 * File : Main.java
 * Deskripsi : kelas utama untuk mengetes Koleksi karakter
 */
public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);

        koleksiKarakter.add('A');
        koleksiKarakter.add('B');
        koleksiKarakter.add('C');
        koleksiKarakter.add('D');
        koleksiKarakter.add('E');
        koleksiKarakter.add('F');
        koleksiKarakter.add('G');
        koleksiKarakter.add('H');
        koleksiKarakter.add('I');
        koleksiKarakter.add('J');

        System.out.println("Isi Koleksi:");
        koleksiKarakter.showAll();

        koleksiKarakter.setIsi(2, 'Z');
        koleksiKarakter.delete(4);

        System.out.println("Setelah update dan delete:");
        koleksiKarakter.showAll();
    }
}