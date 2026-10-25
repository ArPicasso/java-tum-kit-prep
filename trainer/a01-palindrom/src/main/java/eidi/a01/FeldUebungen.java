package eidi.a01;
import java.util.ArrayList;
import java.util.List;
public class FeldUebungen {

    // a)
    public static boolean istPalindrom(int[] feld) {
        int arrayLenght = feld.length;
        int breakPoint = arrayLenght / 2;
        // Проверка (массив до 1 элемента включительно)
        if (arrayLenght == 1){
            return true;
        } else if (feld == null) {
            return false;
        }

        // Цикл с логикой
        if (feld[0] == feld[arrayLenght-1]){
            for (int i = 1; i < breakPoint; i++) {
                if (feld[i] == feld[arrayLenght - 1 - i]){
                    continue;
                } else {
                    return false;
                }
            }
            /*
            Проверка:
            {1,2,3,2,1}
            arrayLenght = 5
            breakPoint = 2

            feld[0] == feld[arrayLenght-1]) | 1 == 1 -> true

            Цикл:

            i=1 i<2:
            feld[i] = feld[3] -> 2,2

             i=2:
            break

            return true


             */

            /*
             Проверка:
            {1,2,3,3,2,1}
            arrayLenght = 6
            breakPoint = 3

            feld[0] == feld[arrayLenght-1]) | 1 == 1 -> true

            Цикл:

            i=1 i<3:
            feld[i] = feld[4] -> 2,2

            i=2 i<3:
            feld[i] = feld[3] -> 3,3

            i=3:
            break

            return true
             */
            return true;
        } else{
            return false;
        }

    }

    // b)
    public static boolean istPalindrom(String wort) {
        // TODO
        int wortLenght = wort.length();
        int stringBreakPoint = wortLenght / 2;


        //Базовые ограничения
        if (wort == null){
            return false;
        } else if (wort == "" || wort ==  " ") {
            return true;
        }
        //Начало логики

        if (Character.toLowerCase(wort.charAt(0)) == Character.toLowerCase(wort.charAt(wortLenght-1))){
            int position;
            for (int i = 1; i < stringBreakPoint; i++) {
                position = wortLenght - i - 1;
                if (Character.toLowerCase(wort.charAt(i)) == Character.toLowerCase(wort.charAt(position))) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        } else{
            return false;
        }

    }

    // c)
    public static int[] umgedreht(int[] feld) {
        int[] umgedrehtFeld = new int[feld.length];
        for (int i = feld.length - 1; i >= 0 ; i--) {
            //System.out.println("Мы вошли в цикл");
            //System.out.println("Взяли: "+ umgedrehtFeld[(feld.length-1)-i] + " Стало: " + feld[i]);
            umgedrehtFeld[(feld.length-1)-i] = feld[i];

        }
        return umgedrehtFeld;
    }

    // d)
    public static void umdrehen(int[] feld) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
