/* Nama File    : Dosen.java
 * Deskripsi    : class yang merepresentasikan objek dosen
 * Pembuat      : Muhammad Aris Maulana / 24060123120036
 * Tanggal      : 1 Maret 2025
 */

public class Dosen {
    /********** ATRIBUT **********/
    private String nip;
    private String nama;
    private String prodi;

    /********** METHOD **********/
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
