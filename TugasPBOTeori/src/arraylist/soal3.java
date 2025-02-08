package arraylist;

import java.util.ArrayList;

/**
 *
 * @author sye
 */
public class soal3 {
    public static void main(String[] args) {
        
        // membuat arraylist exo
        ArrayList<String> exo = new ArrayList<String>();
        
        // method add
        exo.add("Suho");
        exo.add("Xiumin");
        exo.add("Baekhyun");
        exo.add("Chanyeol");
        exo.add("Chen");
        exo.add("Kyungsoo");
        exo.add("Kai");
        exo.add("Sehun");
        exo.add("Luhan");
        exo.add("Tao");
        System.out.println(exo);
        
        // method get
        String leader = exo.get(0);
        System.out.println("EXO leader is " + leader);
        
        // method set
        exo.set(8, "Lay");
        System.out.println(exo);
        
        // methode remove
        exo.remove(9);
        System.out.println(exo); 
        
        exo.size();
    }  
}
