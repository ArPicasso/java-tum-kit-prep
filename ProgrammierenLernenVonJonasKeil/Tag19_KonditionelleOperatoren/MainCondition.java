package Tag19_KonditionelleOperatoren;
import java.util.Scanner;
public class MainCondition {
    public static void main(String[] args){
        //Großer als 5 oder?
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(input > 5 ? "True" : input == 5 ? "Gleich" : "False");
    }
}
