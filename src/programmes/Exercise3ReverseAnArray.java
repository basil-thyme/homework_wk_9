package programmes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Exercise3ReverseAnArray {


    public static void main(String[] args) {        // Declare an array

        ArrayList<Integer> year = new ArrayList<>();
        year.add(2009);
        year.add(2015);
        year.add(1985);
        year.add(1900);
        year.add(2023);

        // Print an array
        System.out.println("Before Reverse ArrayList: " + year);

        //read an array
        /*for( int a: year){
          System.out.println(a);
        }*/
        // reverse logic and print
        Collections.reverse(year);
        System.out.println("After Reverse ArrayList: " + year);

    }


}
