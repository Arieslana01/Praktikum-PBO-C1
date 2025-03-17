/* 
Nama File   : DosenTetap.java
Deskripsi   : Berisi atribut dan method dalam class DosenTetap
Nama/NIM    : Muhammad Aris Maulana / 24060123120036
Tanggal     : 17 Maret 2024
*/
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public LocalDate getBup() { 
        LocalDate bup = getTanggalLahir().plusYears(65);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(1), 1);
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
        System.out.println("NIDN                    : " + getNidn());
        System.out.println("BUP (Batas Usia Pensiun): " + formatTanggal(getBup()));
        System.out.println("Jabatan                 : Dosen tetap");
        System.out.println("Masa Kerja              : " + getMasaKerja());
        long tahunKerja = Period.between(getTmt(), LocalDate.now()).getYears();
        double tunjangan = 0.02 * tahunKerja * getGajiPokok();
        System.out.printf("Tunjangan               : 2%% x %d x Rp %d = Rp %d\n", tahunKerja, (int) getGajiPokok(), (int) tunjangan);
    }
}
