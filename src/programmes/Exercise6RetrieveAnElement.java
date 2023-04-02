package programmes;

import java.util.ArrayList;

/**6. Write a Java program to retrieve an element (at a specified index) from a given
 array list*/
public class Exercise6RetrieveAnElement {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Oranges");
        fruits.add("Peach");
        fruits.add("Plum");

        System.out.println(fruits);

        // Retrieve the first and third element
        String element = fruits.get(0);
        System.out.println("First element: " + element);
        element = fruits.get(2);
        System.out.println("Third element: " + element);

    }


}
