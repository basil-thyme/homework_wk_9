package programmes;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Exercise11CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //comparing both lists


        if (c1.equals(c2)) {
            System.out.println("Array List are equal");
        } else {
            System.out.println("Array List are not equal");
        }

        if (c2.contains("White")) {
            System.out.println("C2 Array List contains the word");

        } else {
            System.out.println("C2 Array list doesn't contains the word");
        }

        c1.remove("White");
        if (c1.equals(c2)) {
            System.out.println("After removing an element array List are equal");
        } else {
            System.out.println("After removing an element array List are not equal");
        }



    }

}
