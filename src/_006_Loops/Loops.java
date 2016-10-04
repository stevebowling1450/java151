package _006_Loops;

/**
 * Created by stevebowling on 10/3/16.
 */
import java.util.Scanner;
public class Loops {
    public static void main(String args[]) {
        // For, For each, While, Do While
//
//        for (int i =1; i <= 6; i++){
//            System.out.println(" Happy Day");
//        }
//            int sum;
//        for (int x=1; x <=11; x++){
//            sum = sum + x;
//          System.out.println(sum);

//        int count = 1;
//        while (count < 11){
//            System.out.println( count);
//            count++;
//        }
        while (true) {

            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);
            Scanner func = new Scanner(System.in);

            double number1;
            double number2;
            String function;
            double total = 0;

            System.out.println("First Num:");
            number1 = num1.nextInt();

            System.out.println("Second Num:");
            number2 = num2.nextInt();

            System.out.println("function + - / * ");
            function = func.next();

            if (function.equals("*")) {
                total = number1 * number2;
            } else if (function.equals("/")) {
                total = number2 / number1;
            } else if (function.equals("-")) {
                total = number2 - number1;
            } else if (function.equals("+")) {
                total = number2 + number1;
            } else {
                System.out.println(" Please input a function");
            }

            System.out.println(total);


        }
    }
}
