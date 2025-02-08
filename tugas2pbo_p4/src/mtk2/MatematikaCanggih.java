/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtk2;

/**
 *
 * @author SYELA
 */
public class MatematikaCanggih extends Matematika{
    String nim;
    String nama;
    
    public MatematikaCanggih(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    
    void getBiodata(){
        System.out.println("NIM: " + nim);
        System.out.println("nama: " + nama);
    }
}