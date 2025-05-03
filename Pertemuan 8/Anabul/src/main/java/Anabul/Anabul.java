/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Anabul;

/**
 *
 * @author apple
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();

    public String getNama() {
        return nama;
    }
}
