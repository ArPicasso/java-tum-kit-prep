package eidi.katas;

public class K06ZaehleVokale {

    /**
     * ★  10 XP
     *
     * Zähle die Vokale a, e, i, o, u im String, egal ob groß oder klein geschrieben.
     * Beispiel: zaehleVokale("Informatik") == 4
     * Tipp: Character.toLowerCase(c) macht aus 'A' ein 'a'.
     */
    public static int zaehleVokale(String s) {
        String alph = "aeiou";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (alph.indexOf(s.charAt(i)) != -1){
                counter++;
            }
        }
        return counter;
    }
}
