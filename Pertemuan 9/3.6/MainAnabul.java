/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File      : MainAnabul.java
 * Deskripsi : Program utama untuk menguji dan menjalankan fungsi koleksi Anabul.
 */
import java.util.Random;

public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul koleksi = new KoleksiAnabul(10);
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int pilih = rand.nextInt(3);
            switch (pilih) {
                case 0:
                    koleksi.add(new Kucing("raja" + i));
                    break;
                case 1:
                    koleksi.add(new Anjing("farhan" + i));
                    break;
                case 2:
                    koleksi.add(new Burung("nico" + i));
                    break;
            }
        }

        koleksi.showAll();
    }
}
