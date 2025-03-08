/* 
 * File : AngkaSialException.Java
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama/NIM: Muhammad Aris Maulana/ 24060123120036
 * Tanggal: 7 Maret 2025
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}