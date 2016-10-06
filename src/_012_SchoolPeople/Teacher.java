package _012_SchoolPeople;

/**
 * Created by stevebowling on 10/6/16.
 */
public class Teacher extends SchoolEmployee {
    int years;
    int grade;

    public Teacher(String n,String l, int y, int g) {
        super(n,l);
        years= y;
        grade=g;
    }

    public String displayInfo() {
        String empInfo = super.displayInfo();
        return "Teacher: "+"\n"+ empInfo + " Years of employment : " + years+"\n"
                +" Grade taught: " + grade;
    }
}
