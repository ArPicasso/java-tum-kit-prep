package Tag7_RandomKlasse;
import java.util.Random;

public class RandomString {
    public static void main(String[] args){
        Random random = new Random();
        String word = "";
        String alphabet = "QWERTZUIOPASDFGHKLYXCVBNM";
        for (int i = 0; i<6; i++){
            word += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        System.out.println(word);
    }
}
