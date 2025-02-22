/* Nama File   : Titik.java
   Deskripsi   : class yang merepresentasikan objek titik dalam koordinat kartesian.
   Pembuat     : Muhammad Aris Maulana / 24060123120036
   Tanggal     : 22 Februari 2025 */

public class Titik {
    // ATRIBUT
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // METHOD
    // konstruktor untuk membuat titik (0,0) tanpa this
   /* Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    } */

   // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    } 

    // konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    // mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis (double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat (double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masingh-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +  ")");
    }

    // mencetak koordinat counter titik
    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    // getKuadran
    int getKuadran(){
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0;
    }

    // getJarakPusat
    double getJarakPusat(){
        return Math.sqrt ((absis * absis) + (ordinat * ordinat));
    }

    // getJarak
    double getJarak(Titik T){
        return Math.sqrt (((absis - T.getAbsis()) * (absis - T.getAbsis())) + ((ordinat - T.getOrdinat()) * (ordinat - T.getOrdinat())));
    }

    // refleksi Y
    void refleksiY(){
        ordinat = ordinat * (-1);
    }

    // refleksi X
    void refleksiX(){
        absis = absis * (-1);
    }

    // getRefleksiX
    Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    // getRefleksiY
    Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    @Override
    public String toString() {
        int xInt = (int) getAbsis();
        int yInt = (int) getOrdinat();
        if (getAbsis() == xInt && getOrdinat() == yInt) {
            return "(" + xInt + ", " + yInt + ")";
        } else {
            return "(" + getAbsis() + ", " + getOrdinat() + ")";
        }
    }
    
}