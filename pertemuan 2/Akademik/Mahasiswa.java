/* Nama File   : Mahasiswa.java
   Deskripsi   : class yang merepresentasikan objek mahasiswa
   Pembuat     : Muhammad Aris Maulana / 24060123120036
   Tanggal     : 1 Maret 2025 */
   
import java.util.ArrayList;
public class Mahasiswa {
// ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

// METHOD
// konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(50); // Inisialisasi ArrayList kosong
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(50);
    }

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }
    public int getJumlahSKS(){
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++){
            totalSKS = totalSKS + listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }
    public int getJumlahMatkul(){
        return listMatkul.size();
    }
    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        for (int i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + getDosenWali().getNama() + " (NIP : " + getDosenWali().getNip() + ", Program Studi : " + getDosenWali().getProdi() + ")");
        System.out.println("Kendaraan yang dimiliki : " + getKendaraan().getJenis() + " (" + getKendaraan().getNoPlat() + ")");
    }
}