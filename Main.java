/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UAS2;

/**
 *
 * @author aryay
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nama: Arya Yusuf Karan
        //NPM: 227064516066
        //Data pegawai
        Pegawai pegawai1=new Pegawai("Izumi Miyamura", "Laki-laki", "P001", true);
        Pegawai pegawai2=new Pegawai("Hori Kyouko", "Perempuan", "P002", false);
        
        //Data programmer
        Programmer programmer1=new Programmer("Ali Imron", "Laki-laki", "PRO1", false, 5, 500000);
        Programmer programmer2=new Programmer("Alya Nurul Zahra", "Perempuan", "PRO2", true, 10, 1000000);
        Programmer programmer3=new Programmer("Arya Yusuf Karan", "Laki-laki", "PRO3", true, 10, 1500000);
        
        //Output data pegawai
        System.out.println("Data Pegawai 1");
        pegawai1.toShow();
        System.out.println();
        
        System.out.println("Data Pegawai 2");
        pegawai2.toShow();
        System.out.println();
        
        //Output data programmer
        System.out.println("Data Programmer 1");
        programmer1.toShow();
        System.out.println();
        
        System.out.println("Data Programmer 2");
        programmer2.toShow();
        System.out.println();
        
        System.out.println("Data Programmer 3");
        programmer3.toShow();
        System.out.println();
    }
    
}
