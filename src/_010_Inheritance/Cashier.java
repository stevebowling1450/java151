package _010_Inheritance;

/**
 * Created by stevebowling on 10/4/16.
 */
public class Cashier {
    public int payday;
    public String name;
    String departments;

    public Cashier(String n, int s,  String d) {
        name = n;
        payday = s;
        departments = d;
    }

    public String getName() {
        return name;
    }

    public int getPayday() {
        return payday;
    }

    public String displayInfo() {
        return " Name: " + name + "\n"
                + " PayDay " + payday + "\n" +
                " department :" + departments+ "\n";
    }



}

