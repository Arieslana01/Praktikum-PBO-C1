/* Nama File    : MataKuliah.java
 * Deskripsi    : class yang merepresentasikan objek Mata kuliah
 * Pembuat      : Muhammad Aris Maulana / 24060123120036
 * Tanggal      : 1 Maret 2025
 */

 public class MataKuliah {
    /********** ATRIBUT **********/
    private String idMatkul;
    private String nama;
    private int sks;

    /********** METHOD **********/
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSKS(){
        return this.sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
