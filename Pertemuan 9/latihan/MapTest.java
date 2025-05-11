/**
 * Nama     : Muhammad Aris Maulana
 * NIM      : 24060123120036
 * File     : MapTest.java
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

 import java.util.*;

 public class MapTest {
     public static void main(String[] args) {
         // kunci -> integer, nilai -> string
         Map<Integer, String> map = new HashMap<Integer, String>();
 
         // menempatkan elemen kunci dan nilai
         map.put(1, "satu");
         map.put(2, "dua");
         map.put(3, "tiga");
 
         // mengambil elemen pertama
         System.out.println(map.get(1));
 
         // mengambil keseluruhan kunci sebagai objek collection Set
         Set<Integer> key = map.keySet();
 
         // bagaimana iterasi untuk mengambil keseluruhan
         // nilai dari kunci ? tulis pada laporan anda!
         // petunjuk : gunakan iterasi seperti program ArrayListTest
     }
 }
 