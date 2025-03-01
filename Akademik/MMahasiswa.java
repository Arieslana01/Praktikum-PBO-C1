/* Nama File   : MMahasiswa.java
   Deskripsi   : Main Class yang digunakan untuk menjalankan dan menguji fungsionalitas pada Mahasiswa.java
   Pembuat     : Muhammad Aris Maulana / 24060123120036
   Tanggal     : 1 Maret 2025 */

public class MMahasiswa{
    public static void main(String[]args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Muhammad Aris", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}