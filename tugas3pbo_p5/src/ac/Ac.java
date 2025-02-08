/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac;

/**
 *
 * @author LENOVO
 */
public class Ac implements InterfaceAc{
    //variabel
    int statusAc;
    
    //method hidupkan AC
    
    @Override
    public void hidupkanAC(){
        if (statusAc == MATI){
            statusAc = HIDUP;
            System.out.println("Hidupkan AC! --> AC Hidup");
        }else{
            System.out.println("Hidupkan AC! --> AC Sudah Hidup");
        }
    }
    
    //method matikan AC
    
    @Override
    public void matikanAC(){
        if (statusAc == HIDUP){
            statusAc = MATI;
            System.out.println("Matikan AC! --> AC Mati");
        }else{
            System.out.println("Matikan AC! --> AC Sudah Mati");
        }
    }
    
    //method panaskan AC
    
    @Override
    public void panaskanAC(){
        if (statusAc == DINGIN){
            statusAc = PANAS;
            System.out.println("Panaskan AC! --> Pemanas AC Menyala");
        }else{
            System.out.println("Panaskan AC! --> Pemanas AC Sudah Menyala");
        }
    }
    
    //method dinginkan AC
    
    @Override
    public void dinginkanAC(){
        if (statusAc == PANAS){
            statusAc = DINGIN;
            System.out.println("Dinginkan AC! --> Pendingin AC Menyala");
        }else{
            System.out.println("Dinginkan AC! --> Pendingin AC Sudah Menyala");
        }
    }
}
