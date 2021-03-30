/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;

/**
 *
 * @author wachid op
 */
public class Main {
     public static void main(String[] args) {
        String nama, nim;
        int umur, uts, uas;
        int pilih;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("+========================+");
        System.out.println("|       Input Data       |");
        System.out.println("+========================+");
        System.out.print("Nama\t  : ");   
        nama = inputUser.next();
        System.out.print("NIM\t  : ");
        nim = inputUser.next();
        System.out.print("Umur\t  : ");
        umur = inputUser.nextInt();
        System.out.print("Nilai UTS : ");
        uts = inputUser.nextInt();
        System.out.print("Nilai UAS : ");
        uas = inputUser.nextInt();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, umur, uts, uas);
        
        do{
            System.out.println("+========================+");
            System.out.println("|          Menu          |");
            System.out.println("+========================+");
            System.out.println("|1. Tampilkan Data       |");
            System.out.println("|2. Edit Data            |");
            System.out.println("|3. Exit                 |");
             System.out.println("+========================+");
            System.out.print("pilih: ");
            pilih = inputUser.nextInt();    

            switch (pilih) {
                case 1:
                    System.out.println("Nama \t: " + mhs.nama);
                    System.out.println("NIM  \t: " + mhs.nim);
                    System.out.println("Umur \t: " + mhs.umur);
                    System.out.println("Nilai UTS : " + mhs.uts);
                    System.out.println("Nilai UAS : " + mhs.uas);
                    System.out.println("Nilai Akhir : " + mhs.total());
                    break;
                case 2:
                    System.out.println("+========================+");
                    System.out.println("|       Input Data       |");
                    System.out.println("+========================+");
                    System.out.print("Nama\t  : ");   
                    nama = inputUser.next();
                    System.out.print("NIM\t  : ");
                    nim = inputUser.next();
                    System.out.print("Umur\t  : ");
                    umur = inputUser.nextInt();
                    System.out.print("Nilai UTS : ");
                    uts = inputUser.nextInt();
                    System.out.print("Nilai UAS : ");
                    uas = inputUser.nextInt();
                    mhs = new Mahasiswa(nama, nim, umur, uts, uas);
                    break;
                    
                default:
                    System.exit(0);
            }
        }while(pilih!=3);
                
    }
    
}
