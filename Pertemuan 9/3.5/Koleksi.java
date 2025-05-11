/**
 * Nama     : Muhammad Aris Maulana
 * NIM      : 24060123120036
 * File : Koleksi.java
 * Deskripsi : kelas generik untuk menyimpan koleksi elemen
 */
public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public T[] getIsi() {
        return wadah;
    }

    public void setIsi(int index, T elemen) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = elemen;
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int ukuran) {
        if (ukuran >= 0 && ukuran <= wadah.length) {
            nbelm = ukuran;
        }
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = elemen;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh!");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--;
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(wadah[i]);
        }
    }
}