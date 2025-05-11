/**
 * Nama      : Muhammad Aris Maulana
 * NIM       : 24060123120036
 * Nama     : Muhammad Aris Maulana
 * NIM      : 24060123120036
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}