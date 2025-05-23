/**
 * Nama File   : Persegi.java
 * Deskripsi   : Kelas Persegi, turunan dari BangunDatar
 * Nama        : Muhammad Aris Maulana
 * NIM         : 24060123120036
 * Tanggal     : 22 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }
    public Persegi(double sisi) {
        super(4, "Default", "Default"); 
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getLuas(){
        return sisi * sisi;
    }
    public double getKeliling(){
        return 4 * sisi;
    }
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi + 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}