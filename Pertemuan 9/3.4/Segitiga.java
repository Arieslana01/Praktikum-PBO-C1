/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * File : Segitiga.java
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 */
public class Segitiga extends BangunDatar {
    private double a, b, c;

    public Segitiga(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double hitungKeliling() {
        return a + b + c;
    }

    public double hitungLuas() {
        double s = hitungKeliling() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}