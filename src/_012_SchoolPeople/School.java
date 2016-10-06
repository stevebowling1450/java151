package _012_SchoolPeople;
import java.util.Date;
import java.util.Scanner;
/**
 * Created by stevebowling on 10/5/16.
 */
public class School {
    public static void main(String args[]) {

        Students s1 = new Students("Fred","Johnson",5,3.3);
        System.out.println(s1.displayInfo());

        Admin a1 = new Admin("Bob","Jones", 12);
        System.out.println(a1.displayInfo());

        Teacher t1 = new Teacher("Mr. Joe","VanHoose", 7,1);
        System.out.println(t1.displayInfo());


        Scanner en = new Scanner(System.in);
        String ename;
        System.out.println("New School Student's first name: ");
        ename = en.nextLine();

        Scanner ep = new Scanner(System.in);
        String epos;
        System.out.println("New School Student's last name: ");
        epos= ep.nextLine();

        Scanner es = new Scanner(System.in);
        int esal;
        System.out.println("New School Student's grade: ");
        esal= en.nextInt();

        Scanner ga = new Scanner(System.in);
        double gradea;
        System.out.println("New School Student's GPA: ");
        gradea = ga.nextDouble();



    Students s2 = new Students(ename,epos, esal, gradea);
            System.out.println( s2.displayInfo());


        Date date = new Date();
        System.out.println(date.toString());

    }
}