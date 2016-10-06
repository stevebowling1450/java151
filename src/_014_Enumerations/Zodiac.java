package _014_Enumerations;

/**
 * Created by stevebowling on 10/6/16.
 */
public enum Zodiac {

    ARIES("Jan"),
    TAURUS("Feb"),
    GEMINI("Mar"),
    CANCER("Apr"),
    LEO("May"),
    VIRGO("Jun"),
    LIBRA("Jul"),
    SCORPIO("Aug"),
    SAGITTARIUS("Sep"),
    CAPRICORN("Oct"),
    AQUARIUS("Nov"),
    PISCES("Dec");


    private String horoSign;


    Zodiac(String horoSign){
        this.horoSign=horoSign;
    }

    public String getHoroSign(){
        return horoSign;
    }

    public static String getMonth(String month){
        return month;
    }

}
