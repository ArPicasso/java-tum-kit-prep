package Tag15_AufgabenWiederholung;
import java.util.Scanner;
public class Aufgabe1 {
    public static void main(String[] args){
        //Variablen
        String status;
        int anzahlDerGerichte;
        double preisProGericht = 0;
        boolean getraenk;

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //1. Status: student, staff oder guest
        System.out.println("Gib dein Status ein (student, staff, guest): ");
        status = scanner.nextLine();
        System.out.println("Perfekt! Dein Status ist: " + status);

        //2. Anzahl der Gerichte
        System.out.print("Gib den Anzahl der Gerichte ein: ");
        anzahlDerGerichte = scanner.nextInt();
        System.out.println("Perfekt! Anzahl der Gerichte ist: " + anzahlDerGerichte);

        //3. Preis pro Gericht
        for (int i = 1; i <= anzahlDerGerichte; i++){
            System.out.println("Gib den Preis für Gericht " + i + " :");
            preisProGericht = preisProGericht + scanner.nextDouble();
        }
        System.out.println("Perfekt! Gesamtpreis (ohne Rabatt) ist: " + preisProGericht);


        //4. Getränk gewünscht: true/false
        System.out.println("Brauchen Sie etwas zum trinken? (true - ja, false - nein)");
        getraenk = scanner.nextBoolean();
        System.out.println("Perfekt! Dein Wahl ist: " + getraenk);

        //Preisberechnung
        System.out.println(preisBerechnung(status,preisProGericht,getraenk) + " Euro ist Gesamtsumme.");

    }
    public static double preisBerechnung(String status, double preisProGericht, boolean getraenk){
        double ergebnis;
        if (getraenk){
            preisProGericht += 1.5;
        }
        if (status.equals("student")){
            ergebnis = preisProGericht * 0.7;
            if (ergebnis > 20.0){
                return  ergebnis - 2;
            } else {
                return ergebnis;
            }
        } else if (status.equals("staff")){
            ergebnis = preisProGericht * 0.9;
            if (ergebnis > 20.0){
                return  ergebnis - 2;
            } else {
                return ergebnis;
            }
        } else {
            ergebnis = preisProGericht;
            if (ergebnis > 20.0){
                return  ergebnis - 2;
            }
            return ergebnis;
        }

    }

}
