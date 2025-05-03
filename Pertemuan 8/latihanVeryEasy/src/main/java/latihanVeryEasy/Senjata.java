/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author apple
 */
public class Senjata {
    private String tipe;
    private int peluru;
    
    public Senjata(String tipe) {
        this.tipe = tipe;
        this.peluru = 0; // Default peluru awal 0
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void setPeluru(int jumlah) {
        this.peluru = jumlah;
    }
    
    public void menembak() {
        if (peluru > 0) {
            peluru--;
            System.out.println(tipe);
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println(tipe + " tidak dapat menembak. Peluru habis!");
        }
    }
}