package _010_Inheritance;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/4/16.
 */
public class LearningInheritance {
    public static void main(String args[]) {

    Employee e1 = new Employee("Steve Bowling", 150000, " Grunt", "Employee");
        System.out.println( e1.displayInfo());

        Manager m1 = new Manager("Sam ", 45000, " Salesman", "Manager");
        System.out.println( m1.displayInfo());

        Manager m2 = new Manager("Bob ", 45000, "IT Manager", "Manager");
        System.out.println( m2.displayInfo());

        Cashier c1 = new Cashier("Debby", 22000,"Employee");
        System.out.println( c1.displayInfo());

        int rate;
        Scanner scale= new Scanner(System.in);
        System.out.println("Please rate your happiness 1 -10:");
        rate= scale.nextInt();
        System.out.println(happy(rate));
    }

    static String happy(int rate){
        if (rate <5){
            return ("What can we do bettter??");
        }
        else {
            return ("We are glad you are happy!");
        }
    }
}
