package _015_fileProcessing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by stevebowling on 10/7/16.
 */
public class ReadingData {
    public static void main(String [] args)throws IOException{

        String fileName = "numbers.txt";
        Scanner inFile = new Scanner(new FileReader(fileName));
        int toNum;
        while (inFile.hasNextLine()){
            toNum = Integer.parseInt(inFile.nextLine());
            System.out.println(toNum);
        }

    }
}
