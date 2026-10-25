package eidi.katas;

public class K09Quersumme {

    /**
     * ★★  20 XP
     *
     * Gib die Quersumme einer Zahl n >= 0 zurück (Summe ihrer Ziffern).
     * Beispiel: quersumme(472) == 13, denn 4 + 7 + 2 = 13
     * Tipp: n % 10 ist die letzte Ziffer, n / 10 schneidet sie ab. Benutze eine while-Schleife.
     */
    public static int quersumme(int n) {
        int summe = 0;
        while (n >= 10){
            summe += n%10;
            n/=10;
        }
        return summe+n;
    }
}
