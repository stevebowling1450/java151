package _015_fileProcessing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by stevebowling on 10/7/16.
 */
public class WritingData {
    public static void main(String [] args) throws IOException{
        String fileName = "numbers.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));

        for (int i=1; i<11; i++){
            outFile.println(i);}

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int x=11; x< 21; ++x){
            list1.add(x);
        outFile.println(x);}

        outFile.println(64);
        outFile.println(77);
        outFile.println(78);
        outFile.println(79);
        outFile.println(80);
        outFile.println(81);
        outFile.println("hello");
        outFile.close();





    }
}
