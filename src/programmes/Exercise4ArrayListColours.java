package programmes;

import java.util.ArrayList;

/**4. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.*/
public class Exercise4ArrayListColours {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Violet");

        //read and print
        for(String s :colors ){
            System.out.println(s);
        }
        System.out.println("The size of colors list : " +colors.size());
        colors.remove(3);
        System.out.println("New colors list after removing element: " + colors);

    }


}
