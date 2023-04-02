package programmes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Exercise5Iterate {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Violet");
        System.out.println(colors);

        // Get the iterator
        Iterator<String> it = colors.iterator();
        /*System.out.print(it.next()+", ");
        System.out.print(it.next()+", ");
        System.out.print(it.next()+", ");
        System.out.print(it.next()+", ");
        System.out.print(it.next()+", ");*/

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }


}
