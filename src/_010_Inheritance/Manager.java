package _010_Inheritance;

/**
 * Created by stevebowling on 10/4/16.
 */
public class Manager extends Employee {

    String departments;



    public Manager(String n, int s, String p, String d) {
        super(n, s ,p);
        departments = d;
    }

     public String displayInfo() {
         String empInfo = super.displayInfo();

         return empInfo + " Department: " + departments + "\n";
     }


    public void changeSalary(Employee e1, int i) {

    }
}
