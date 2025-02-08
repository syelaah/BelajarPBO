/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtk1;

/**
 *
 * @author SYELA
 */
public class Matematika {
    int a = 8;
    int b = 3;
    double tambah, kali, kurang, bagi;
    void tambah(){
        tambah = a + b;
        System.out.println("Hasil dari pertambahan a dan b = " + tambah);
    }
    
    void kali(){
        kali = a * b;
        System.out.println("Hasil dari perkalian a dan b = " + kali);
    }
    
    void kurang(){
        kurang = a - b;
        System.out.println("Hasil dari perkurangan a dan b = " + kurang);
    }
    
    void bagi(){
        bagi = a / b;
        System.out.println("Hasil dari pembagian a dan b = " + bagi);
    }
    
}