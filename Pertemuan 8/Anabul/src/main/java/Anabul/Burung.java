/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;

/**
 *
 * @author apple
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara: Cuit!");
    }
}