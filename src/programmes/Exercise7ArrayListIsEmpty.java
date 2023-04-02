package programmes;

import java.util.ArrayList;
/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Exercise7ArrayListIsEmpty {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Oranges");
        fruits.add("Peach");
        fruits.add("Plum");

        System.out.println(fruits);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("list = " + list);

        //Check if list is empty or not
        System.out.println(isArrayListEmptyOrNot(fruits));
        System.out.println(isArrayListEmptyOrNot(list));
       // System.out.println(isArrayListStringEmptyOrNot(fruits));
    }

    public static boolean isArrayListEmptyOrNot(ArrayList arrayList) {
        boolean ans = arrayList.isEmpty();
        return ans;
    }
    /*public static boolean isArrayListStringEmptyOrNot(ArrayList<String> arrayList) {
        boolean ans = arrayList.isEmpty();
        return ans;
    }*/
   /* public static boolean isArrayListIntegerEmptyOrNot(ArrayList<Integer> arrayList) {
        boolean ans = arrayList.isEmpty();
        return ans;
    }*/
}
