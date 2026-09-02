package Tag16_ForEachSchleife;
import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        int[] array = new int[5];
        int counter = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = counter;
            counter++;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}