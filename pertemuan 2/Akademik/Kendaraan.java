/* Nama File    : Kendaraan.java
 * Deskripsi    : class yang merepresentasikan objek kendaraan
 * Pembuat      : Muhammad Aris Maulana / 24060123120036
 * Tanggal      : 1 Maret 2025
 */

public class Kendaraan {
    /********** ATRIBUT **********/
    private String noPlat;
    private String jenis;

    /********** METHOD **********/
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
