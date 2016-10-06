package _014_Enumerations;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/6/16.
 */
public class MainHoro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Whats your sign??");

        Zodiac newSign = Zodiac.valueOf(input.next().toUpperCase());
        System.out.println("Your Zodiac Month is: "+ newSign.getHoroSign());
    }

}