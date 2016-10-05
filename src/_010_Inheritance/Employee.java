package _010_Inheritance;

/**
 * Created by stevebowling on 10/4/16.
 */
public class Employee {

    public int payday;
   public String name;
    String position;
    String departments;

    public Employee( String n, int s, String p, String d ){
        name = n;
        payday = s;
        position = p;
        departments = d;
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
                " Position: "+ position + "\n"
                + " department :" + departments + "\n";
    }






}
