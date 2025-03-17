/* 
Nama File   : DosenTamu.java
Deskripsi   : Berisi atribut dan method dalam class DosenTamu
Nama/NIM    : Muhammad Aris Maulana / 24060123120036
Tanggal     : 17 Maret 2024
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private String nidk;
    private int masaKontrak;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, int masaKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.masaKontrak = masaKontrak;
        this.kontrakBerakhir = LocalDate.now().plusMonths(masaKontrak);
    }
    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }
    public int getMasaKontrak() { 
        return masaKontrak; 
    }

    public void setMasaKontrak(int masaKontrak) { 
        this.masaKontrak = masaKontrak; 
    }

    public LocalDate getKontrakBerakhir() {
        return kontrakBerakhir;
    }

    public String getSisaKontrak() {
        LocalDate sekarang = LocalDate.now();
        
        if (sekarang.isAfter(kontrakBerakhir)) {
            return "Masa kontrak sudah berakhir :)";
        }

        Period period = Period.between(sekarang, kontrakBerakhir);
        int tahun = period.getYears();
        int bulan = period.getMonths();

        long sisaBulan = ChronoUnit.MONTHS.between(sekarang, kontrakBerakhir);
        return sisaBulan + " bulan";
    }

    public String getMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(getTmt(), sekarang);
        int tahun = period.getYears();
        int bulan = period.getMonths();
        return tahun + " tahun " + bulan + " bulan";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK                    : " + getNidk());
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Tanggal Akhir Kontrak   : " + formatTanggal(kontrakBerakhir));
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.println("Sisa Kontrak            : " + getSisaKontrak());
        double tunjangan = 0.025 * getGajiPokok();
        System.out.printf("Tunjangan               : 2,5%% x Rp %d = Rp %d\n", (int) getGajiPokok(), (int) tunjangan);
    }
}
