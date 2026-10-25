package eidi.katas;

public class K07Palindrom {

    /**
     * ★★  20 XP
     *
     * Gib true zurück, wenn das Wort vorwärts und rückwärts gleich ist.
     * Groß-/Kleinschreibung wird ignoriert.
     * Beispiel: istPalindrom("Anna") == true, istPalindrom("Java") == false
     * Der leere String "" ist ein Palindrom.
     * Bonus-Idee: Es reicht, nur bis zur Mitte zu laufen. Warum?
     */
    public static boolean istPalindrom(String wort) {
        int wortLenght = wort.length();
        int breakpoint = wortLenght / 2;
        if (wort == ""){
            return true;
        } else if (wort == null) {
            return false;

        }
        if (wort.charAt(0) == wort.charAt(wortLenght-1)){
            for (int i = 0; i < breakpoint; i++) {
                if (Character.toLowerCase(wort.charAt(i)) == Character.toLowerCase(wort.charAt(wortLenght-1-i))){
                    continue;
                }
                return false;
            }
        } else{
            return false;
        }

        return true;

    }
}
