/* 
 * File : ExceptionOnArray.Java
 * Deskripsi: Program penggunaan eksepsi menggunakan class library Java
 * Nama/NIM: Muhammad Aris Maulana/ 24060123120036
 * Tanggal: 7 Maret 2025
 * */

public class ExceptionOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("Clean up code...");
        }
    }
}