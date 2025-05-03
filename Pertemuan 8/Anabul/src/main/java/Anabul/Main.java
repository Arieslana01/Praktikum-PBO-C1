/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;

/**
 *
 * @author apple
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek Anabul
        Kucing kucing = new Kucing("Milo");
        Anjing anjing = new Anjing("Bobby");
        Burung burung = new Burung("Tweety");

        // Demonstrasi kelas Datum dengan berbagai tipe
        System.out.println("=== Demonstrasi Kelas Datum ===");
        Datum<Anabul> datum1 = new Datum<>(kucing);
        datum1.tampilkanInfo();

        Datum<Anabul> datum2 = new Datum<>(anjing);
        datum2.tampilkanInfo();

        Datum<Anabul> datum3 = new Datum<>(burung);
        datum3.tampilkanInfo();

        // Demonstrasi ContohMetodeGenerik
        System.out.println("\n=== Demonstrasi ContohMetodeGenerik ===");
        ContohMetodeGenerik.tampilkanDatum(datum1);
        
        // Mengubah isi datum1
        ContohMetodeGenerik.ubahIsiDatum(datum1, new Kucing("Kitty"));
        ContohMetodeGenerik.tampilkanDatum(datum1);

        // Membandingkan dua datum
        Datum<Anabul> datum4 = new Datum<>(new Kucing("Kitty"));
        boolean sama = ContohMetodeGenerik.bandingkanIsi(datum1, datum4);
        System.out.println("Apakah datum1 dan datum4 sama? " + sama);
        
        sama = ContohMetodeGenerik.bandingkanIsi(datum1, datum2);
        System.out.println("Apakah datum1 dan datum2 sama? " + sama);
    }
}