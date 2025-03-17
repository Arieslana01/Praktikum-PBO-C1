/* 
Nama File   : Pegawai.java
Deskripsi   : Berisi atribut dan method dalam class Pegawai
Nama/NIM    : Muhammad Aris Maulana / 24060123120036
Tanggal     : 17 Maret 2024
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return tanggal.format(formatter);
    }
    public String formatTmt(LocalDate tmt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return tmt.format(formatter);
    }

    protected long hitungMasaKerja() {
        return LocalDate.now().getYear() - tmt.getYear();
    }

    public void printInfo() {
        System.out.println("NIP                     : " + getNip());
        System.out.println("Nama                    : " + getNama());
        System.out.println("Tanggal Lahir           : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT                     : " + formatTmt(getTmt()));
        System.out.printf("Gaji Pokok              : Rp %.0f\n", getGajiPokok());
    }
}