package _005_Conditionals;

/**
 * Created by stevebowling on 10/3/16.
 *
 *
 */
import java.util.Scanner;

public class Conditionals {
    public static void main(String args[]){
//        boolean saladForLunch = false;
//
//        if (saladForLunch)
//            System.out.println("Man that's a lot of salad!!");
//        else
//            System.out.println("Should have had a V8");

 /*
	        CHALLENGE: I want to order some Colts gear online, and I'm not sure
	        which courier service to use yet. I want to know which one to use
	        for Next Day Air, 2 day air, 3 day ground, and whenever. Can you write
	        an if/else statement that helps me pick the best one? It's just your opinion here.
	    */

        boolean nextDay = false;
        boolean secDay = false;

        if (nextDay)
            System.out.println("Next Day is the best");

        else if (secDay)
            System.out.println("2nd Day is the best");
        else
        System.out.println("3rd Day is the best");

        Scanner city = new Scanner(System.in);
        String bCity;
        System.out.println("Password: ");
        bCity= city.nextLine();

        String password = "password123";


        if (bCity.equals(password))
            System.out.println("Password Correct!!");
        else
            System.out.println("Wrong Password!!");
            

    }
}
