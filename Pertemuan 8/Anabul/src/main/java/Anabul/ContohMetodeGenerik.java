/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;

/**
 *
 * @author apple
 */
public class ContohMetodeGenerik {
    public static <T> void tampilkanDatum(Datum<T> datum) {
        System.out.println("Menampilkan Datum:");
        datum.tampilkanInfo();
    }

    public static <T> void ubahIsiDatum(Datum<T> datum, T isiBaru) {
        System.out.println("Mengubah isi Datum...");
        datum.setIsi(isiBaru);
    }

    public static <T> boolean bandingkanIsi(Datum<T> datum1, Datum<T> datum2) {
        return datum1.getIsi().equals(datum2.getIsi());
    }
}