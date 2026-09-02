package Tag18_SwitchCase;
import java.util.Scanner;

public class challengeSwitch {
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        loop : while (true){
            String input = scan.nextLine();
            counter ++;
            switch (input){
                case "Eins":
                    sum++;
                    break;
                case "Zwei":
                    sum += 2;
                    break;
                case "Drei":
                    sum += 3;
                    break;
                case "Vier":
                    sum += 4;
                    break;
                case "Fünf":
                    sum += 5;
                    break;
                default:
                    counter--;
                    System.out.println("Durchschnitt ist " +  (double) sum / counter);
                    break loop;
            }
        }
    }
}
