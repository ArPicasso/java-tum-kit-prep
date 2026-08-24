package Tag7_RandomKlasse;
import java.util.Random;
public class RandomZahl {
    public static void main(String[] args){
        Random random = new Random();
        int zufallszahl = random.nextInt(10);
        System.out.println(zufallszahl);
    }

}

