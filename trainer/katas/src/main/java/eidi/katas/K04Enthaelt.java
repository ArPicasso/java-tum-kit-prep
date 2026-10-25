package eidi.katas;

public class K04Enthaelt {

    /**
     * ★  10 XP
     *
     * Gib true zurück, wenn die Zahl x im Feld vorkommt, sonst false.
     * Beispiel: enthaelt({4, 8, 15}, 8) == true
     */
    public static boolean enthaelt(int[] feld, int x) {
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == x){
                return true;

            }
        }
        return false;
    }
}
