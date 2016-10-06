package _012_SchoolPeople;
import java.util.Date;
/**
 * Created by stevebowling on 10/5/16.
 */
public class SchoolEmployee {

    public String name;
    public String last;


    public SchoolEmployee(String n, String l) {
        name=n;
        last=l;


    }


    public String getName(){return name;}
    public String getLast(){return last;}


    public String displayInfo(){
        return " Name: " + name +" "+ last +"\n";

    }


















}








