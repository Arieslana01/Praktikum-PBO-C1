public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("raja");
        Anabul anjing = new Anjing("nisa");
        Anabul burung = new Burung("ladya");

        Anabul[] peliharaan = {kucing, anjing, burung};
        
        System.out.println("Demonstrasi Polimorfisme pada Hewan Peliharaan:");
        
        for (Anabul hewan : peliharaan) {
            System.out.println("Hewan: " + hewan.getNama());
            hewan.bersuara();
            hewan.gerak();
            System.out.println();
        }
    }
}