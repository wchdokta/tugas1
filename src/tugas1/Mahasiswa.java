/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author wachid op
 */
public class Mahasiswa {
    String nama, nim;
    int umur, uts, uas;

    public Mahasiswa(String nama, String nim, int umur, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.uts = uts;
        this.uas = uas;
    }
    
    int total(){
        return (uas+uts)/2;
    }
}
