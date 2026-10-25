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
            loop: for (int j = 0; j < alph.length(); j++) {
                if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(alph.charAt(j))){
                    counter++;
                    break loop;
                }
            }
        }
        return counter;
    }
}
