package eidi.katas;

public class K10IstSortiert {

    /**
     * ★★  20 XP
     *
     * Gib true zurück, wenn das Feld aufsteigend sortiert ist.
     * Gleiche Nachbarn sind erlaubt: {1, 2, 2, 5} ist sortiert, {1, 3, 2} nicht.
     * Ein leeres Feld und ein Feld mit einem Element sind sortiert.
     * Achtung beim letzten Index: feld[i + 1] darf nicht aus dem Feld herauslaufen!
     */
    public static boolean istSortiert(int[] feld) {
        if (feld.length == 0) {
            return true;
        }
        for (int i = 0; i <= feld.length - 2; i++) {
            if (feld[i] > feld[i+1]){
                return false;
            }
        }
        return true;
    }
}
