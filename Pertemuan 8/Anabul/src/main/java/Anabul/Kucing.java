/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anabul;

/**
 *
 * @author apple
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }
}

