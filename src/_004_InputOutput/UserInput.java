package _004_InputOutput;

/**
 * Created by stevebowling on 10/3/16.
 * Getting user data into a program
 */
import java.util.Scanner;




public class UserInput {
    public static void main(String args[]){
        Scanner inputInfo = new Scanner(System.in);
        String name;
        System.out.println("Enter your name below ");
        name= inputInfo.nextLine();

        Scanner city = new Scanner(System.in);
        String bCity;
        System.out.println("Where were you born? ");
        bCity= city.nextLine();

        Scanner age = new Scanner(System.in);
        int yAge;
        System.out.println("What is your age? ");
        yAge = age.nextInt();


        Scanner fact = new Scanner(System.in);
        String fFact;
        System.out.println("Give me a fun fact abut you. ");
        fFact = fact.nextLine();


        System.out.println("Thank You " + name + "You are from "+ bCity + "You are "+ yAge+ "A fun Fact about you is" +fFact);




    }
}
