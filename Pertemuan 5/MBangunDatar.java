/**
 * Nama File   : MBangunDatar.java
 * Deskripsi   : Main class untuk menguji BangunDatar
 * Nama        : Muhammad Aris Maulana
 * NIM         : 24060123120036
 * Tanggal     : 22 Maret 2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("Eksperimen dengan Reference Type BangunDatar\n");

        // Objek dengan konstruktor yang benar
        BangunDatar P1 = new Persegi(10); // Menggunakan konstruktor baru
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        // Panggil method-method yang sudah ada
        System.out.println("Luas Persegi P2: " + P2.getLuas());
        System.out.println("Keliling Persegi P2: " + P2.getKeliling());

        System.out.println("Luas Lingkaran L2: " + L2.getLuas());
        System.out.println("Keliling Lingkaran L2: " + L2.getKeliling());

        // Print informasi objek
        System.out.println("\nInfo Persegi P2:");
        P2.printInfo();

        System.out.println("\nInfo Lingkaran L2:");
        L2.printInfo();

        System.out.println("Apakah luas P1 dan L1 sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah keliling P2 dan L2 sama? " + P2.isEqualKeliling(L2));

        // Eksperimen pemanggilan method IResize
        System.out.println("\nEksperimen dengan IResize:");

        System.out.println("\nSebelum ZoomIn:");
        System.out.println("Persegi P2: " + P2.getSisi());
        System.out.println("Lingkaran L2: " + L2.getJariJari());

        P2.zoomIn();
        L2.zoomIn();
        
        System.out.println("\nSetelah ZoomIn (10% lebih besar):");
        System.out.println("Persegi P2: " + P2.getSisi());
        System.out.println("Lingkaran L2: " + L2.getJariJari());

        P2.zoomOut();
        L2.zoomOut();
        
        System.out.println("\nSetelah ZoomOut (10% lebih kecil):");
        System.out.println("Persegi P2: " + P2.getSisi());
        System.out.println("Lingkaran L2: " + L2.getJariJari());

        P2.zoom(150); // Memperbesar ukuran menjadi 150%
        L2.zoom(75);  // Mengecilkan ukuran menjadi 75%
        
        System.out.println("\nSetelah Zoom dengan parameter:");
        System.out.println("Persegi P2: " + P2.getSisi());
        System.out.println("Lingkaran L2: " + L2.getJariJari());

        // Print jumlah objek yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}


