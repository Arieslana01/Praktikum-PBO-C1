/* Nama File   : MGaris.java
   Deskripsi   : Main Class yang digunakan untuk menjalankan dan menguji fungsionalitas pada Garis.java
   Pembuat     : Muhammad Aris Maulana / 24060123120036
   Tanggal     : 22 Februari 2025 */

public class MGaris{
    public static void main(String[]args){
        Titik titikAwal = new Titik(0,0);
        Titik titikAkhir = new Titik(1,1);
        Titik T3 = new Titik (-2,0);
        Titik T4 = new Titik (0,4);
        Garis G1 = new Garis(titikAwal, titikAkhir);
        Garis G2 = new Garis(T3,T4);
        G1.setTitikAwal (new Titik(2,3));
        G1.setTitikAkhir (new Titik(4,5));
        G1.printTitikAwalAkhir();

        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
        System.out.println("Jumlah Objek Garis 1 = " + G1.getCounterGaris());

        System.out.println("Panjang dari Garis 1 = " + G1.getpanjangGaris());
        System.out.println("Gradien dari Garis 1 = " + G1.getGradien());
        System.out.println("Titik tengah dari Garis 1 = " + G1.gettitikTengah());

        System.out.println("Apakah Garis 1 dan Garis 2 sejajar? ");
        if (G1.isSejajar(G2)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        System.out.println("Apakah Garis 1 dan Garis 2 Tegak lurus? ");
        if (G1.istegakLurus(G2)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        System.out.println("Persamaan Garis 2 = " + G2.getPersamaan());
    }
}