/* 
 * File : AngkaSial.Java
 * Deskripsi: Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Nama/NIM: Muhammad Aris Maulana/ 24060123120036
 * Tanggal: 7 Maret 2025
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* Ketika eksepsi terjadi, apakah baris 12 pd AngkaSial.java diatas dieksekusi
 * JAWAB = Tidak, jika angkanya 13, dikarenakan exception terjadi sebelum mencapai baris tersebut
 * tetapi untuk angka selain 13 IYA akan dieksekusi
 * 
 * Apakah baris 21 pada AngkaSial.java dieksekusi?
 * JAWAB = Tidak, karena exception pada as.CobaAngka(13) membuat program langsung masuk 
 * ke blok catch, sehingga as.CobaAngka(12); tidak dijalankan
 */