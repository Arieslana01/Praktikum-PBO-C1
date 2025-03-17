/* 
Nama File   : Main.java
Deskripsi   : Menjalankan dan menampilkan informasi
Nama/NIM    : Muhammad Aris Maulana / 24060123120036
Tanggal     : 17 Maret 2024
*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Dosen Tetap
        System.out.println("Dosen Tetap");
        DosenTetap dosen1 = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika");
        dosen1.printInfo();

        // Dosen Tamu
        System.out.println("\nDosen Tamu");
        DosenTamu dosenTamu1 = new DosenTamu("36362828", "4948447373", "ArisMaul", LocalDate.of(2005, 8, 1), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Bisnis", 24);
        dosenTamu1.printInfo();

        // Tendik
        System.out.println("\nTendik");
        Tendik tendik1 = new Tendik("47474747", "Eros", LocalDate.of(2004, 3, 20), LocalDate.of(1995, 9, 1), 5000000, "Akademik");
        tendik1.printInfo();
    }
}