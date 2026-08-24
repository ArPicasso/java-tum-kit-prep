package Tag7_RandomKlasse;

//Цель программы написать генератор рандомного слова из 5 букв, на четных цифрах которого стоят класные (четными считаем позиции 0,2,4)

import java.util.Random;
public class DayChallenge {
    public static void main(String[] args){
        Random random = new Random();
        String vokal_alphabet = "EUIOA";
        String konsonant_alphabet = "QWZPSDFJKLXCVBNM";
        String word = "";
        for (int i = 0; i<5; i++){
            if (i%2==0){
                word += vokal_alphabet.charAt(random.nextInt(vokal_alphabet.length()));
            } else {
                word += konsonant_alphabet.charAt(random.nextInt(konsonant_alphabet.length()));
            }
        }
        System.out.println(word);
    }
}
