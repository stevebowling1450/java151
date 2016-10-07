package _015_fileProcessing;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/7/16.
 */
public class Main {
    public static void main(String [] args){
        int num=0, den , result;
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter a Numerator:");
            num = in.nextInt();

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a Denominator:");
            den = in.nextInt();

            result = num / den;
            System.out.println("Output: " + result);


        }
        catch (ArithmeticException ae){

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number other than 0 :");
            System.out.println("Enter a Denominator:");
            den = in.nextInt();

            result = num / den;
            System.out.println("Output: " + result);

        }



    }
}
