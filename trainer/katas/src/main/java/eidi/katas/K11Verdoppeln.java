package eidi.katas;

public class K11Verdoppeln {

    /**
     * ★★  20 XP
     *
     * Verdopple JEDES Element im übergebenen Feld. Die Methode gibt nichts zurück (void):
     * Du änderst direkt das Feld, das du bekommen hast.
     * Beispiel: feld = {1, 5, -2}; verdoppleAlle(feld); danach ist feld == {2, 10, -4}
     * Achtung: Mit for-each (for (int x : feld)) klappt das NICHT. Probier es aus und überlege, warum.
     */
    public static void verdoppleAlle(int[] feld) {
        for (int i = 0; i < feld.length; i++) {
            feld[i] *= 2;
        }
    }
}
