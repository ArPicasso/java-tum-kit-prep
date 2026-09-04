package Tag22_FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {
    public static void main(String[] args){
        File datei = new File("/Users/steve/IdeaProjects/HelloTUM/ProgrammierenLernenVonJonasKeil/Tag22_FileReading/sample1.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(datei);
        } catch (FileNotFoundException e){
            System.out.println("File not found...");
        }
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}
