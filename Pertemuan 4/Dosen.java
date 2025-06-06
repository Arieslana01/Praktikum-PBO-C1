/* 
Nama File   : Dosen.java
Deskripsi   : Berisi atribut dan method dalam class Dosen
Nama/NIM    : Muhammad Aris Maulana / 24060123120036
Tanggal     : 17 Maret 2024
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas                : " + getFakultas());
    }
}