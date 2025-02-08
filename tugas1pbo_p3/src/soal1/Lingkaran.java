package soal1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author syela
 */
public class Lingkaran{
    //variabel
    private double jarijari = 7;
    private String warna = "biru";
    
    //konstruktor pertama
    public Lingkaran(){
        this.jarijari = jarijari;
        this.warna = warna;
    }
    
    //konstruktor kedua
    public Lingkaran(double r){
        this.jarijari = r;
        this.warna = warna;
    }
    
    //method jari-jari
    public void getJariJari(){
        System.out.println("Menampilkan jari-jari dan luas lingkaran");
        System.out.println("Jari-Jari pada lingkaran ini adalah " + jarijari);
    }
    
    //method luas
    public void getLuas(){
        double phi = 3.14;
        double luas;
        luas = phi * jarijari * jarijari;
        System.out.println("Luas pada lingkaran ini adalah " + luas);
    }
    
    //method warna
    public void getWarna(){
        System.out.println("Warna lingkaran ini adalah " + warna + "\n");
    }
}