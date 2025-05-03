/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author apple
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public boolean isPeluru(int jumPeluru) {
        return senjata.getPeluru() >= jumPeluru;
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        
        if (isPeluru(jumlah)) {
            // Menembak sebanyak jumlah yang diminta
            for (int i = 0; i < jumlah; i++) {
                System.out.println(senjata.getBunyi());
            }
            senjata.setPeluru(senjata.getPeluru() - jumlah);
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        } else {
            // Menembak sebanyak peluru yang tersisa
            int sisaPeluru = senjata.getPeluru();
            for (int i = 0; i < sisaPeluru; i++) {
                System.out.println(senjata.getBunyi());
            }
            senjata.setPeluru(0);
            System.out.println("Gagal tembak, Peluru Habis");
            System.out.println("Gagal tembak, Peluru Habis");
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public String menusuk() {
        return senjata.isMenusuk() ? "Ya" : "Tidak";
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
}
