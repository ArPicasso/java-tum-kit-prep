package eidi.katas;

public class K02Maximum {

    /**
     * ★  10 XP
     *
     * Gib die größte Zahl im Feld zurück.
     * Beispiel: maximum({3, 9, 2}) == 9
     * Das Feld hat immer mindestens ein Element. Achtung: Es kann nur negative Zahlen enthalten!
     */
    public static int maximum(int[] feld) {
        int ma = -999;
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] > ma){
                ma = feld[i];
            }
            
        }
        return ma;
    }
}
