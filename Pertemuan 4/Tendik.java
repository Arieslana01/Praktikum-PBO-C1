/* 
Nama File   : Tendik.java
Deskripsi   : Berisi atribut dan method dalam class Tendik
Nama/NIM    : Muhammad Aris Maulana / 24060123120036
Tanggal     : 17 Maret 2024
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {
    private String bidangKerja;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidangKerja) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidangKerja = bidangKerja;
    }

    public String getBidangKerja() {
        return bidangKerja;
    }

    public void setBidangKerja(String bidangKerja) {
        this.bidangKerja = bidangKerja;
    }

    public LocalDate getBup() {
        LocalDate bup = super.getTanggalLahir().plusYears(55);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(1), 1);
    }

    public String getMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(super.getTmt(), sekarang);
        int tahun = period.getYears();
        int bulan = period.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang Kerja            : " + bidangKerja);
        System.out.println("BUP (Batas Usia Pensiun): " + formatTanggal(getBup()));
        long masaKerja = super.hitungMasaKerja();
        double tunjangan = 0.01 * masaKerja * getGajiPokok();
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.printf("Tunjangan               : 1%% x %d x Rp %d = Rp %d\n", masaKerja, (int) getGajiPokok(), (int) tunjangan);
    }
}