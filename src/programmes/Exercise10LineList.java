package programmes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
public class Exercise10LineList {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> linePassing = new HashMap<String, ArrayList<String>>();
        linePassing.put("Angel", new ArrayList<>());
        linePassing.get("Angel").add("Northern Line");

        linePassing.put("Bank", new ArrayList<>());
        linePassing.get("Bank").add("Northern Line");
        linePassing.get("Bank").add("Central line");
        linePassing.get("Bank").add("Waterloo & City line");
        linePassing.get("Bank").add("DLR");
        linePassing.get("Bank").add("Central");
        //System.out.println(linePassing.get("Bank"));

        linePassing.put("Bakerloo", new ArrayList<>());
        linePassing.get("Bakerloo").add("Bakerloo line");
        linePassing.get("Bakerloo").add("Jubilee line");
        linePassing.get("Bakerloo").add("Metropolitan line");
        linePassing.get("Bakerloo").add("Hammersmith & City line");

        HashMap<String, String> tubeZone = new HashMap<>();
        tubeZone.put("Angel", "Zone 1");
        tubeZone.put("Bank", "Zone 1");
        tubeZone.put("Bakerloo", "Zone 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the station name : ");
        String nameOfStation = sc.next();
        System.out.println("Lines passing through " + nameOfStation + " is: " + linePassing.get(nameOfStation));
        System.out.println( nameOfStation + " is in the " + tubeZone.get(nameOfStation));

    }

}
