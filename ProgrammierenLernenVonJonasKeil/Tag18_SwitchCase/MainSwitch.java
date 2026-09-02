package Tag18_SwitchCase;
import java.util.Random;
public class MainSwitch {
    public static void main(String [] args){
        Random random = new Random();
        String ergebnis = " ";
        for (int i = 0; i < 10; i++) {
            int wuerfel = random.nextInt(6)+1;
            switch (wuerfel) {
                case 1:
                    ergebnis = "eins";
                    System.out.println(ergebnis);
                    break;
                case 2:
                    ergebnis = "zwei";
                    System.out.println(ergebnis);
                    break;
                case 3:
                    ergebnis = "drei";
                    System.out.println(ergebnis);
                    break;
                case 4:
                    ergebnis = "vier";
                    System.out.println(ergebnis);
                    break;
                case 5:
                    ergebnis = "fuenf";
                    System.out.println(ergebnis);
                    break;
                case 6:
                    ergebnis = "sechs";
                    System.out.println(ergebnis);
                    break;
                default:
                    ergebnis = "ungueltig";
                    System.out.println(ergebnis);

            }
        }
    }
}
