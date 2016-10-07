package _012_SchoolPeople;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by stevebowling on 10/5/16.
 */
public class Students extends SchoolEmployee {

    public int grade;
    public double gpa;

    public Students(String n, String l, int g, double gp) {
        super(n, l);
        grade = g;
        gpa = gp;
    }

    public String displayInfo() {
        String empInfo = super.displayInfo();
        return "Student: " + "\n" + empInfo + " Grade: " + grade + "\n" +
                " GPA: " + gpa;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }

    static String moreG;
    static int tp;
    static int i;
    int ag;

    public static void addGrade(int ag) {
        ArrayList<Integer> gradeBook = new ArrayList<>();
        while (true) {
            Scanner tp = new Scanner(System.in);
            System.out.println("Please enter a Grade:");
            ag = tp.nextInt();
            gradeBook.add(ag);

            Scanner more = new Scanner(System.in);
            System.out.println("Enter more grades? y/n ");
            moreG = more.nextLine();

            if (moreG.equals("n")) {
                System.out.println("The grades you have entered: ");
                for (int i = 0; i < gradeBook.size(); i++) {
                    System.out.println("A score of : " + gradeBook.get(i) + "\n");
                }
                break;
            }
        }
    }
}
