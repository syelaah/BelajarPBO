/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ac;

/**
 *
 * @author LENOVO
 */
public interface InterfaceAc {

    public static final int HIDUP = 1;
    public static final int MATI = 0;
    public static final int PANAS = 1;
    public static final int DINGIN = 0;
    
    public abstract void matikanAC();
    public abstract void hidupkanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
}
