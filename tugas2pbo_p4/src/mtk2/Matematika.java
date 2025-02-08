/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtk2;

/**
 *
 * @author SYELA
 */
public class Matematika{
    double tambah, kurang;
    void pertambahan(double a, double b, double c){
        tambah = a + b + c;
        System.out.println("a + b + c = " + tambah);
    }
    
    void pertambahan(int a, double b){
        tambah = a + b;
        System.out.println("a + b = " + tambah);
    }
    
    void penguragan(double a, int b, int c){
        kurang = a - b - c;
        System.out.println("a - b - c = " + kurang);
    }
    
    void pengurangan(double a, int b){
        kurang = a - b;
         System.out.println("a - b = " + kurang);
    }
}