/* Nama File   : Garis.java
   Deskripsi   : class yang merepresentasikan objek garis dalam koordinat kartesian
   Pembuat     : Muhammad Aris Maulana / 24060123120036
   Tanggal     : 22 Februari 2025 */

public class Garis {
    // ATRIBUT
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // METHOD
    // konstruktor untuk membuat titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    // Konstruktor untuk membuat titik awal dan akhir
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    // selektor titik awal
    Titik getTitikAwal(){
        return titikAwal;
    }
    // selektor titik akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }
    // Mutator titik awal
    void setTitikAwal (Titik titikAwal){
        this.titikAwal = titikAwal;
    }
    // Mutator titik akhir
    void setTitikAkhir (Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }
    // mengembalikan nilai counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }
    // mengembalikan panjang garis
    double getpanjangGaris(){
        return titikAwal.getJarak(titikAkhir);
    }
    // mengembalikan gradien garis
    double getGradien(){
        return (titikAkhir.getOrdinat()-titikAwal.getOrdinat()) / (titikAkhir.getAbsis()-titikAwal.getAbsis());
    }
    // mengembalikan titik tengah
    Titik gettitikTengah(){
        return new Titik((titikAkhir.getAbsis() + titikAwal.getAbsis())/2 , (titikAkhir.getOrdinat() + titikAwal.getOrdinat())/2);
    }
    // mengembalikan garis sejajar
    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }
    // mengembalikan garis tegak lurus
    boolean istegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }
    // menampilkan titik awal dan akhir
    void printTitikAwalAkhir(){
        System.out.println("Titik Awal = (" + titikAwal.getAbsis()+ ","+ titikAwal.getOrdinat()+")");
        System.out.println("Titik Akhir = (" + titikAkhir.getAbsis()+ ","+ titikAkhir.getOrdinat()+")");
    }
    String getPersamaan() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        
        // Cek apakah m dan c bilangan bulat
        int mInt = (int) m;
        int cInt = (int) c;
        
        String mStr = (m == mInt) ? String.valueOf(mInt) : String.format("%.2f", m);
        String cStr = (c == cInt) ? String.valueOf(cInt) : String.format("%.2f", c);
        
        if (c >= 0) {
            return "y = " + mStr + "x + " + cStr;
        } else {
            return "y = " + mStr + "x - " + cStr.substring(1);
        }
    }
   }