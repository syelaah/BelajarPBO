/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author syela
 */
public class Pegawai {
    //variabel
    Integer id = 17;
    String nama = "Aman Sejahtera";
    Integer gaji = 1500000;
    
    //konstruktor
    public Pegawai(){
        this.id = id;
        this.nama = nama;
        this.gaji = gaji;
    }
    //method
    public void getId(){
        System.out.println("id pegawai: " + id);
    }
    
    public void getNama(){
        System.out.println("nama pegawai: " + nama);
    }
    
    public void getGaji(){
        System.out.println("gaji per bulan: " + gaji);
    }
    
    public void getGajiTerbaru(){
        Integer gajiBaru;
        gajiBaru = (gaji * 10/100) + gaji;
        System.out.println("gaji per bulan saat ini: " + gajiBaru + "(naik 10%)");
    }
    
    public void getGajiSetahun(){
        Integer gajiSetahun;
        gajiSetahun = ((gaji * 10/100) + gaji) * 12;
        System.out.println("gaji per tahun: " + gajiSetahun);
    }
}