package _010_Inheritance;

import java.util.Scanner;

/**
 * Created by stevebowling on 10/4/16.
 */
public class Employee {

    public int payday;
    protected String name;
    protected String position;


    public Employee(String n, int s, String p ){
        name = n;
        payday = s;
        position = p;

    }

    public String getName(){
        return name;
    }

    public int getPayday(){
        return payday;
    }

    public String displayInfo(){
        return " Name: " + name +"\n"
              +" PayDay "  + payday + "\n" +
                " Position: "+ position + "\n";

    }
    // method for how do you like your job
    protected String aprovaRate(int i){
        if (i >5)
            return " Glad you are Happy!!";
        else
            return " What can we do better??";
    }










}
