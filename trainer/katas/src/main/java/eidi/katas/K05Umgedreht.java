package eidi.katas;

public class K05Umgedreht {

    /**
     * ★  10 XP
     *
     * Gib den String rückwärts zurück.
     * Beispiel: umgedreht("Java") == "avaJ"
     * Tipp: s.length() ist die Länge, s.charAt(i) das Zeichen an Stelle i (ab 0).
     */
    public static String umgedreht(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            output+=s.charAt(s.length()-1-i);
        }

        return output;
    }
}
