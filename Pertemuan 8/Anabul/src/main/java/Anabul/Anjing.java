/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;

/**
 *
 * @author apple
 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) bersuara: Guk-guk!");
    }
}