/* 
 * File : Asersi2.Java
 * Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkarang yang bernilai nol
 * Nama/NIM: Muhammad Aris Maulana/ 24060123120036
 * Tanggal: 7 Maret 2025
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!!";
        Lingkaran 1 = new Lingkaran(jariJari);
        double kelilingLingkaran = 1.hitungKeliling();
        System.out.println("keliling Lingkaran= " + kelilingLingkaran);
    }
}

//Ada program yang kurang tepat pada program diatas?
/* JAWAB: Pada program ini, jariJari diinisiasi dengan nilai 0, yang melanggar jariJari >0.
padahal harusnya asersi digunakan untuk menangkap kesalahan logika, kalau kaya gitu maka program akan gagal
dan jika di run maka tidak akan menemukan file Asersi2
*/