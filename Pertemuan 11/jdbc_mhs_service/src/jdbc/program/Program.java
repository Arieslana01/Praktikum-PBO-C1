/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.*;

/**
 *
 * @author apple
 */

public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("------TAMBAHKAN------");
        Mahasiswa mhsAdd = new Mahasiswa(01, "Aris");
        service.add(mhsAdd);
        System.out.println("berhasil menambahkan: " + mhsAdd);
        service.displayAll();

        // update
        System.out.println("------UPDATE------");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Data lama: " + mhsUpdate);
        mhsUpdate.setNama("Maulana");
        System.out.println("akan di update dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        service.displayAll();

        // delete
        System.out.println("------HAPUS------");
        System.out.println("Data akan di hapus: " + service.getById(5));
        service.delete(5);
        service.displayAll();
    }
}
