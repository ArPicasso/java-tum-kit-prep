package Tag10_KlassenObjekte;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Hund hundObjekt1 = new Hund();
        hundObjekt1.bellen();
        Random random = new Random();
        int zahl1 = random.nextInt(100);
        int zahl2 = random.nextInt(100);
        System.out.println("Zwei Zahlen sind gegeben: " + zahl1 + " und " + zahl2);
        hundObjekt1.plusRechnen(zahl1,zahl2);

    }
}
