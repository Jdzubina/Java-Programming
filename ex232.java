import java.util.ArrayList;
import java.util.Iterator;
// Arraylists
public class ex232 {

    public static void main (String [] args){

        ArrayList<String> cups = new ArrayList<>();

        cups.add("Silver");
        cups.add("Black");
        cups.add("#1");
        cups.add("Maroon");

        System.out.println(cups.get(3));

        Iterator cupList = cups.iterator();
        while (cupList.hasNext()){
            System.out.println(cupList.next());
        }
        cups.remove("Maroon");
        cupList = cups.iterator();
        while (cupList.hasNext()){
            System.out.println(cupList.next());
        }


    }
}
