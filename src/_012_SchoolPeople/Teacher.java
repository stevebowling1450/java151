package _012_SchoolPeople;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * Created by stevebowling on 10/6/16.
 */
public class Teacher extends SchoolEmployee {

    int years;
    int grade;

    public Teacher(String n, String l, int y, int g) {
        super(n, l);
        years = y;
        grade = g;
    }

    public String displayInfo() {
        String empInfo = super.displayInfo();
        return "Teacher: " + "\n" + empInfo + " Years of employment : " + years + "\n"
                + " Grade Taught: " + grade;
    }
           static int tp;
           static int i;
            int ag;
           static String moreG;


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
                for (int i=0; i < gradeBook.size(); i++){
                System.out.println("A score of : "+ gradeBook.get(i) + "\n");}
                break;

            }



        }


            }



}