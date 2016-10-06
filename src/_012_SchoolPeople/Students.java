package _012_SchoolPeople;
import java.util.Date;

/**
 * Created by stevebowling on 10/5/16.
 */
public class Students extends SchoolEmployee {

    public int grade;
    public double gpa;

    public Students(String n,String l,  int g, double gp) {
        super(n,l);
        grade=g;
        gpa=gp;
    }

    public String displayInfo() {
        String empInfo = super.displayInfo();
        return "Student: "+"\n"+ empInfo + " Grade: "+ grade+"\n"+
                " GPA: "+ gpa;
    }

    public String getName(){return name;}
    public int getGrade(){return grade;}
    public double getGpa(){return gpa;}




}
