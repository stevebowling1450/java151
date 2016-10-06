package _012_SchoolPeople;
import java.util.Date;
import java.util.Scanner;
/**
 * Created by stevebowling on 10/5/16.
 */
public class SchoolEmployee {

    public String name;
    public String last;

    public SchoolEmployee(String n, String l) {
        name = n;
        last = l;
    }

    public String getName() {
        return name;
    }

    public String getLast() {
        return last;
    }

    public String displayInfo() {
        return " Name: " + name + " " + last + "\n";
    }

    public static void whoAreYou(){
        Scanner en = new Scanner(System.in);
        String ename;
        System.out.println("Are you a Teacher? y/n: ");
        ename = en.nextLine();
        if (ename.equals("y")){
            Teacher.addGrade(95);
        }
        else {
            Students.addGrade();
        }
}

















}








