import java.util.Scanner;
public class WhileErsteProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = "true";
        while (input.equals("true") || input.equals("True")){
            System.out.println("_________________");
            System.out.println("Audioplayer is working...");
            System.out.print("Print true or false: ");
            input = scan.next();
            if (!(input.equals("false" ) || input.equals("true") || input.equals("False" ) || input.equals("True"))){
                System.out.println("_________________");
                System.out.println("Wrong input\nYou wrote:\t"+input);

                break;
            }
        }
        System.out.println("_________________");
        System.out.println("Player is stopped, Bye!");
    }
}
