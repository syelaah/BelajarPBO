package meet12;
import java.util.ArrayList;
/**
 *
 * @author sye
 */
public class ArtisBeraksi {
    public static void main(String[] args) {
        ArrayList<String> artis = new ArrayList<>();
        
        // point 1
        artis.add("Agnes Mo");
        artis.add("Raisa Andriana");
        artis.add("Maudy Ayunda");
        artis.add("Citra Kirana");
        artis.add("Cinta Laura");
        
        System.out.println(artis);
        
        // point 2
        artis.add("Chelsea Islan");
        
        System.out.println(artis);
        
        
        // point 3
        artis.add(2, "Natasha Wilona"); 
        artis.add(3, "Pevita Pearce"); 
       
        System.out.println(artis);
       
        
        // point 4
        artis.remove(4);
        artis.add(4, "Velove Vexia");  
        
        System.out.println(artis);
    } 
}