/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;

/**
 *
 * @author apple
 */
public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }

    public void tampilkanInfo() {
        if (isi instanceof Anabul) {
            Anabul hewan = (Anabul) isi;
            hewan.gerak();
            hewan.bersuara();
        } else {
            System.out.println("Isi Datum: " + isi.toString());
        }
    }
}