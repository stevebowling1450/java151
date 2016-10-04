package _009Classes;

import _007_Arrays.Arrays;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/4/16.
 */
public class LearningClasses {
    public static void main(String args[]) {

//        Car tesla = new Car();
//        tesla.make = "tesla";
//        tesla.model = "Tesla III";
//        tesla.year = 2017;
//        tesla.owners.add("Steve");
//        tesla .motorCC = 2300;
//        tesla.tireSize = 21;
//        tesla.numOfDoors = 2;
//        tesla.makeNoise("honk");
//        tesla.wheelCheck(4);
            String word=" ";
        while (true) {
            Scanner sNum = new Scanner(System.in);
            int num;
            System.out.println("Number to be Squared  ");
            num = sNum.nextInt();

            System.out.println(num + " Squared Equals " + square(num));
            Scanner rRun = new Scanner(System.in);
            System.out.println("Another Number? y/n");
            word = rRun.next();
            if (word.equals("n")||word.equals("N")){
                break;
            }
        }
        int tempIn;
        Scanner temp= new Scanner(System.in);
        System.out.println("Please Enter a F Temp:");
        tempIn = temp.nextInt();
        System.out.println(tempIn +" Converted temp "+ returnC(tempIn) );
    }

    static int square(int number) {
        return number * number;
    }

    static double returnC (int temp){
        return ( temp -32) *5/9 ;
    }





}










