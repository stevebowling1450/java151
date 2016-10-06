package _012_SchoolPeople;
import java.util.Date;

/**
 * Created by stevebowling on 10/5/16.
 */
public class Admin extends SchoolEmployee {
int years;

    public Admin(String n,String l, int y) {
        super(n,l);
        years= y;
    }

    public String displayInfo() {
        String empInfo = super.displayInfo();
        return "Admin: "+"\n"+ empInfo + " Years of employment : " + years+"\n";
    }
}