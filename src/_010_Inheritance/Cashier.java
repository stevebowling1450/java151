package _010_Inheritance;

/**
 * Created by stevebowling on 10/4/16.
 */
public class Cashier extends Employee {

    public Cashier(String n, int s, String p) {
        super(n, s ,p);

    }

    public String displayInfo(){
        String empInfo = super.displayInfo();

        return empInfo;
    }



    }
