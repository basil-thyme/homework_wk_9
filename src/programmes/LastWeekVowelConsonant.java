package programmes;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class LastWeekVowelConsonant {

    public static void main(String[] args) {
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");

        String s1 = s.next();

        char ch = s1.charAt(0);

        int length = s1.length();

            if (length == 1) {
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        i++;
                }
                if (i == 1)
                    System.out.println("Character " + ch + " is Vowel");
                else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    System.out.println("Character " + ch + " is Consonant");
                else
                    System.out.println("Invalid letter");
            } else {
                System.out.println("Please enter a character not a string");
            }
        }

    }













