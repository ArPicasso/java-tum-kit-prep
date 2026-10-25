package eidi.katas;

public class K03ZaehleGerade {

    /**
     * ★  10 XP
     *
     * Zähle, wie viele gerade Zahlen im Feld stehen.
     * Beispiel: zaehleGerade({1, 2, 4, 7}) == 2
     * Tipp: Eine Zahl x ist gerade, wenn x % 2 == 0. Auch 0 und negative Zahlen wie -4 sind gerade.
     */
    public static int zaehleGerade(int[] feld) {
        int counter = 0;
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
