package _003_Numbers;

/**
 * Created by stevebowling on 10/3/16.
 */
public class Operators {

    public static void main(String[] args) {


        int age = 40;
        int birthYear = 1976;
        int daysProgramming = 20;
        int numSiblings = 3;

        int ten = 5+5;

        //int vacationDays = UserNumber.vacationDays - daysused;
        int inc = ++ten;
        System.out.println(inc);





        System.out.println(ten);

       // kpascascio [1:10 PM]
//    Lets create a story with our operators
//    Create an empty double variable for bankAccount
//    Fill your bankAccount with your desired amount
//    go shopping, and purchase 3 things, and add it to a receipt variable
//    subtract the receipt amount from your bank account
//    Make sure that after we are reducing our bankAccount that we are always printing it out so we know what's in it

        double bankAccount;
        double receipt;
        double food = 15.45;
        double drink = 4.5;
        double fun = 25.75;
        bankAccount = 123.45;
        receipt = food + drink + fun;
        System.out.println(receipt);
        bankAccount = bankAccount - receipt;
        System.out.println(bankAccount);
        int payday = 2000;
        bankAccount = bankAccount + payday;
        System.out.println(bankAccount);
        bankAccount = bankAccount / 2;
        System.out.println(bankAccount);
        int stranger = 10;
        bankAccount = bankAccount * stranger;
        System.out.println(bankAccount);
        // You're sad... until a generous stranger tell you that he wants to times whatever you have in your bank by 10!
// Your ex-spouse is back she wants not only divide your 7 vacation properties by 3 she convince the judge to only let you have the remainder
// create a new variable for your vacation houses and show the remainder

// you should be left with only one house
        int vacHomes = 7;
        int split = 3;
        double howmany;
        howmany= vacHomes % split;

        System.out.println(howmany);








    }
    }
