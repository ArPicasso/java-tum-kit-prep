package Tag15_AufgabenWiederholung;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Aufgabe2 {

    public static void main(String[] args){
        int s = 0;
        int currentNumber;
        int mi = 5;
        int ma = 1;
        double durschnitt;
        int erfolgStudent = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(5)+1;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            currentNumber = array[i];
            s += currentNumber;
            if (currentNumber < mi){
                mi = currentNumber;
            } else if (currentNumber > ma){
                ma = currentNumber;
            }
            if (currentNumber<=4){
                erfolgStudent++;
            }

        }
        durschnitt = (double) s / array.length ;
        System.out.println(durschnitt + " " + ma + " " + mi + " " + erfolgStudent);

    }
    public static String printArray(int[] array){
        return Arrays.toString(array);
    }
    public static double calculateAverage(int s,int [] array){
        return (double) s / array.length;
    }
}
