/* 
 * File : Asersi1.Java
 * Deskripsi: Program untuk menunjukan asersi
 * Nama/NIM: Muhammad Aris Maulana/ 24060123120036
 * Tanggal: 7 Maret 2025
 */

public class Asersi1{
    public static void main(String[]args){
        int x=0;
        if (x>0){
            System.out.println("x bilangan positif"); 
        } else {
            assert (x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}