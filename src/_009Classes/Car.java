package _009Classes;

import java.util.ArrayList;

/**
 * Created by stevebowling on 10/4/16.
 */
public class Car {


    ArrayList<String>owners = new ArrayList<>();
    String make;
    String model;
    int year;
    int motorCC;
    int tireSize;
    int numOfDoors;
    boolean isOn;
    int numWheels;

    public void makeNoise(String noise){
        if (isOn) {
            System.out.println(noise);

        }
    }

    public void wheelCheck(int numWheels){
        if (numWheels < 4){
            System.out.println("Not working car!!");
        }
        else {
            System.out.println("Working car!!");
        }
    }

}
