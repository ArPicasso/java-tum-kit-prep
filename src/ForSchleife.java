import java.util.Scanner;

public class ForSchleife {
    public static void main(String[] args){
        System.out.println("Rechnen wir? ");
        Scanner scan = new Scanner(System.in);
        int input;
        input = scan.nextInt();
        for (int i = 0; i<input+1; i++){
            System.out.println("Now is " + i);

        }
    }
}
