package _012_SchoolPeople;
import java.util.Date;
/**
 * Created by stevebowling on 10/5/16.
 */
public class School {
    public static void main(String args[]) {

        Students s1 = new Students("Fred","Johnson",5,3.3);
        System.out.println(s1.displayInfo());

        Admin a1 = new Admin("Bob","UpAndDown", 12);
        System.out.println(a1.displayInfo());


        Date date = new Date();
        System.out.println(date.toString());


    }
}