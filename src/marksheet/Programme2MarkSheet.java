package marksheet;
/**2.   * Write a java program to input student Name, roll No, and three subjects Math, Science and
        * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        * Input, Marks should between 0 to 100”) and find out total, percentage and result.
        * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
        * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        * _______________________________
        * | |
        * | Mark Sheet |
        * |_______________________________|
        * | Name : Jay |
        * | Roll No: 08 |
        * |_______________________________|
        * | Subjects : Marks |
        * |_______________________________|
        * | Math : 98 |
        * | Science : 90 |
        * | English : 85 |
        * |_______________________________|
        * | Total : 273 |
        * |_______________________________|
        * | Percentage : 91.0 |
        * | Result : Pass |
        * | Grade : A+ |
        * |_______________________________|
        */
import java.util.Scanner;

public class Programme2MarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.println("Enter Student Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Marks of Subject Maths: ");
        int mathsMarks = sc.nextInt();
        boolean mathsResult = true;
        while (mathsResult) {
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                mathsMarks = sc.nextInt();

            } else {
                mathsResult = false;
            }
        }

        System.out.print("Enter Marks of Subject English: ");
        int englishMarks = sc.nextInt();
        boolean englishResult = true;
        while (englishResult) {
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                englishMarks = sc.nextInt();

            } else {
                englishResult = false;
            }
        }
        System.out.print("Enter Marks of Subject Science: ");
        int scienceMarks = sc.nextInt();
        boolean scienceResult = true;
        while (scienceResult) {
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                scienceMarks = sc.nextInt();

            } else {
                scienceResult = false;
            }
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, englishMarks, scienceMarks);
        String grade = calculateGrade(percentage,result);
        printTheMarkSheet(name, rollNo, mathsMarks,englishMarks,scienceMarks,total,percentage,result,grade);
        sc.close();

    }

    //calculating the sun
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathsMarks, int englishMarks, int scienceMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {

            return "Fail";
        } else {
            return "Pass";
        }

    }
    public static String calculateGrade(int percentage, String result){
        String grade = null;
        if (result.equalsIgnoreCase("Pass")){
            if(percentage >= 80){
                grade = "A+";
            }else if (percentage >= 60){
                grade = "A";
            }else if(percentage >= 50){
                grade = "B";
            }else if(percentage >= 35){
                grade = "C";
            }else{
                grade = "-";
            }
        }
       return grade;
    }

    public static void printTheMarkSheet(String name, int rollNo, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNo+ "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }


}