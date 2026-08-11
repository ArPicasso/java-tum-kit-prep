import java.util.Scanner;
public class RestaurantSoftWhileTraining {
    public static void main (String[] args){
        boolean status = true;
        int totalGuests = 0;
        int reservedGuests = 0;
        String input = "";
        Scanner scan = new Scanner(System.in);
        while (status){
            System.out.print("Gäste anmelden (1), Check total guests(2), Program beenden(3):");
            input = scan.next();
            if (input.equals("1")){
                System.out.print("Wie viel Gäste kommen noch? Schreib hier: ");
                reservedGuests = scan.nextInt();
                System.out.println("ein Platz für "+ reservedGuests + " gebucht");
                totalGuests += reservedGuests;
            } else if (input.equals("2")){
                System.out.println("Es geht um "+ totalGuests + " Personen");
            } else if (input.equals("3")) {
                System.out.println("Program beendet sich...");
                status = false;
            } else {
                System.out.println("Angabe ist falschgegeben");
            }
        }
    }
}
