/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS2;

/**
 *
 * @author aryay
 */
public class Pegawai {
    //Nama: Arya Yusuf Karan
    //NPM: 227064516066
    //Atribut pegawai
    String nama;
    String jk;
    String NoPegawai;
    boolean menikah;
    
    //Konstruktor pegawai
    Pegawai(String nama, String jk, String NoPegawai, boolean menikah){
        this.nama=nama;
        this.jk=jk;
        this.NoPegawai=NoPegawai;
        this.menikah=menikah;
    }
    
    //Method untuk mendapat tunjangan berdasarkan status menikah dan jenis kelamin
    public int getTunjangan(){
        if (menikah&&jk.equals("Laki-laki")){
            return 200000;
        }
        else if (menikah&&jk.equals("Perempuan")){
            return 150000;
        }
        else {
            return 100000;
        }
    }
    
    //Method untuk menampilkan data diri
    public void toShow(){
        System.out.println("Nama: "+ nama);
        System.out.println("Jenis Kelamin: "+ jk);
        System.out.println("No Pegawai: "+ NoPegawai);
        System.out.println("Status: "+ (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}

//Kelas programmer yang merupakan sub class dari pegawai
class Programmer extends Pegawai{
    int LamaBekerja;
    double gaji;

    //Konstruktor programmer
    public Programmer(String nama, String jk, String NoPegawai, boolean menikah, int LamaBekerja, double gaji) {
        super(nama, jk, NoPegawai, menikah);
        this.LamaBekerja=LamaBekerja;
        this.gaji=gaji;
    }
    
    //Method untuk mendapatkan bonus berdasarkan lama bekerja
    public double getBonus(){
        if (LamaBekerja<5){
            return 0.05*gaji;
        }
        else {
            return 0.1*gaji;
        }
    }
    
    //Method untuk menampilkan data diri, tunjangan, beserta bonus programmer
    @Override
    public void toShow(){
        System.out.println("Tunjangan: "+ getTunjangan());
        System.out.println("Bonus: "+ getBonus());
    }
}