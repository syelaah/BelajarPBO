/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author syela
 */
public class TesLingkaran {
    //instance class Lingkaran
    public static void main(String[]args){
        //object pertama
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.getJariJari();
        lingkaran1.getLuas();
        lingkaran1.getWarna();
        
        //object kedua
        Lingkaran lingkaran2 = new Lingkaran(28);
        lingkaran2.getJariJari();
        lingkaran2.getLuas();
        lingkaran2.getWarna();
        }
}