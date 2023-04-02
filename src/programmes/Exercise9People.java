package programmes;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.*/
public class Exercise9People {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("George", 24);
        people.put("Peter", 15);
        people.put("John", 20);
        people.put("Mark", 18);
        System.out.println(people);
        //System.out.println(people.get("John"));
        //System.out.println(people.get("Mark"));

        //System.out.println(people.keySet());

        for(String s : people.keySet()){
            System.out.println("Name : " + s + " Age : " + people.get(s));
        }



    }



}
