public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("Bangun Datar");
        BangunDatar B1 = new BangunDatar(10, "Hijau", "Thin");
        B1.printInfo();
        System.out.println();
        
        System.out.println("Persegi");
        Persegi P1 = new Persegi(4, "Merah", "Bold");
        P1.printInfo();
        System.out.println();
        
        System.out.println("Lingkaran");
        Lingkaran L1 = new Lingkaran(3.14, "Hijau", "Normal");
        L1.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();
    }
}