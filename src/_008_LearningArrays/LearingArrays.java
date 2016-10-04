package _008_LearningArrays;

/**
 * Created by stevebowling on 10/4/16.
 */
import java.util.ArrayList;
public class LearingArrays {
    public static void main(String args[]) {
        int grade1, grade2, grade3, total;
//
//
       double avg;
//
//        grade1 = 78;
//        grade2 = 88;
//        grade3 = 91;
//
//        total=grade1 + grade2 + grade3;
//
//        avg = total / 3;

//        ArrayList<Integer> grades = new ArrayList<>();
//
//        grades.add(78);
//        grades.add(88);
//        grades.add(91);
//
//
//        for (int i=0; i< grades.size(); ++i){
//            total += grades.get(i);
//        }
//        avg = total / grades.size();
//        System.out.print("The avg grade is" + avg);
//        String grades;

//        String list=" ";
//
//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Steve ");
//        names.add("Crystal ");
//        names.add("Lenny ");
//        names.add("Jeremiah ");
//
//        for (int i=0; i< names.size(); ++i){
//           list += names.get(i);
//        }
//        String greet=" ";
//        ArrayList<String> greeting = new ArrayList<>();
//
//        greeting.add("hello");
//        greeting.add("hey");
//        greeting.add("hows it going");
//        greeting.add("Whats up");
//
//        for (int i=0; i< names.size(); ++i){
//            greet += greeting.get(i);
//        }
//            String ans = greeting + list;
//        System.out.println(ans);


        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i=1; i< 12; ++i){
                list1.add(i);}

        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(list1.size()-1));


    }
}
