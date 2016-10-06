package _010_Inheritance;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/4/16.
 */
public class LearningInheritance {
    public static void main(String args[]) {

    Employee e1 = new Employee("Steve Bowling", 150000, " Grunt");
        System.out.println( e1.displayInfo());

        Manager m1 = new Manager("Sam ", 45000, " Salesman", "Manager");
        System.out.println( m1.displayInfo());

        Manager m2 = new Manager("Bob ", 45000, "IT Manager", "Manager");
        System.out.println( m2.displayInfo());

        Cashier c1 = new Cashier("Debbie", 22000,"Cashier");
        System.out.println( c1.displayInfo());

        m1.changeSalary(e1,33000);
        System.out.println(e1.displayInfo());


        System.out.println(m1.displayInfo());
        m1 = new Manager("Mathew Hamstring", 95000, "Manager", "Marketing");
        System.out.println(m2.displayInfo());



        // scanner for how do you like your job
        Scanner input = new Scanner(System.in);
        int response;
        System.out.println("How happy are you with your job? 1 - 10 ");
        response= input.nextInt();
        System.out.println(e1.aprovaRate(response));


        {

            Scanner en = new Scanner(System.in);
            String ename;
            System.out.println("New SchoolEmployee's name: ");
            ename= en.nextLine();


            Scanner es = new Scanner(System.in);
            int esal;
            System.out.println("New SchoolEmployee's Salary: ");
            esal= en.nextInt();


            Scanner ep = new Scanner(System.in);
            String epos;

            System.out.println("New SchoolEmployee's position: ");
            epos= ep.nextLine();



            Employee e2 = new Employee(ename, esal,  epos);
            System.out.println( e2.displayInfo());}






    }

}