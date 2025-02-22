/* Nama File   : MTitik.java
   Deskripsi   : Main Class yang digunakan untuk menjalankan dan menguji fungsionalitas pada Titik.java
   Pembuat     : Muhammad Aris Maulana / 24060123120036
   Tanggal     : 22 Februari 2025 */

public class MTitik {
    public static void main (String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik T4 = " + T4.getCounterTitik());

        System.out.println("Kuadran Titik T1 = " + T1.getKuadran());
        System.out.println("Jarak Titik T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak Titik T1 ke Titik T2 = " + T1.getJarak(T2));

        Titik refleksiX;
        Titik refleksiY;

        refleksiX = T4.getRefleksiX();
        System.out.println("Refleksi T4 terhadap sumbu X = (" + refleksiX.getAbsis() +", " + refleksiX.getOrdinat() +")");

        refleksiY = T4.getRefleksiY();
        System.out.println("Refleksi T4 terhadap sumbu Y = (" + refleksiY.getAbsis() +", " + refleksiY.getOrdinat() +")");
    }
}