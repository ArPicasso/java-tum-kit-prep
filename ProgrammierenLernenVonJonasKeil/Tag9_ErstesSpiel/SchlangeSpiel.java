package Tag9_ErstesSpiel;
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;
public class SchlangeSpiel {
    public static void main(String[] args){
        boolean SpielStatus = true;
        Point[] heroes = SpielHeroes();
        String HauptSpielFeld = SpielFeld(heroes[0], heroes[1], heroes[2], heroes[3]);
        System.out.println(HauptSpielFeld);
        while (SpielStatus){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            System.out.println(SpielFeld(SpielLogik(input, heroes[0]), heroes[1], heroes[2], heroes[3]));

        }
    }

    private static Point SpielLogik(String input, Point SpielerPoint) {
        if (input.equals("w")){
            SpielerPoint.y--;
            return SpielerPoint;
        } else if (input.equals("a")){
            SpielerPoint.x--;
            return SpielerPoint;
        } else if (input.equals("s")){
            SpielerPoint.y++;
            return SpielerPoint;
        } else if (input.equals("d")){
            SpielerPoint.x++;
            return SpielerPoint;
        } else{
            System.out.println("Wrong Input");
            return SpielerPoint;
        }
    }

    private static Point[] SpielHeroes() {
        boolean GenStatus;

        Random random = new Random();


        Point SpielerPoint = new Point(random.nextInt(10),random.nextInt(5));
        Point GoldPoint = new Point(random.nextInt(10),random.nextInt(5));
        Point TuerPoint = new Point(random.nextInt(10),random.nextInt(5));
        Point SchlangePoint = new Point(random.nextInt(10),random.nextInt(5));

        if (!(TuerPoint.x == SchlangePoint.x && TuerPoint.y == SchlangePoint.y) && !(GoldPoint.x == SchlangePoint.x && GoldPoint.y == SchlangePoint.y) && !(SpielerPoint.x == SchlangePoint.x && SpielerPoint.y == SchlangePoint.y) && !(GoldPoint.x == TuerPoint.x && GoldPoint.y == TuerPoint.y)){
            GenStatus = true;
            System.out.println("Heroes sind generiert");
            System.out.println("Positionen sind: \n" + SpielerPoint.x + " " + SpielerPoint.y + " für Spieler \n"+ GoldPoint.x + " " + GoldPoint.y + " für Gold \n"+ TuerPoint.x + " " + TuerPoint.y + " für Tür \n" + SchlangePoint.x  + " " + SchlangePoint.y + " für Schlange");
            return new Point[]{SpielerPoint, GoldPoint, TuerPoint, SchlangePoint};
        } else {
            GenStatus = false;
            System.out.println("Es gibt ein Fehler");
            return SpielHeroes();
        }
    }

    public static String SpielFeld(Point SpielerPoint, Point GoldPoint, Point TuerPoint, Point SchlangePoint){
        //Spielfeld 10x5
        String SpielFeld = "";
        for (int y=0; y<5; y++){
            for (int x=0; x<10; x++){
                Point currentPoint = new Point(x,y);
                if (currentPoint.equals(SpielerPoint)){
                    SpielFeld += "P";
                } else if (currentPoint.equals(GoldPoint)){
                    SpielFeld += "G";
                } else if (currentPoint.equals(TuerPoint)){
                    SpielFeld += "T";
                } else if (currentPoint.equals(SchlangePoint)){
                    SpielFeld += "S";
                } else {
                    SpielFeld += ".";
                }
            }
            SpielFeld += "\n";
        }
        System.out.println("Spielfeld ist generiert");
        return SpielFeld;

    }

}
