# Aufgabe 03: Referenzen und Call-by-Value

**Thema:** Referenzen, Speichermodell, Call-by-Value, flache vs. tiefe Kopie
(Folien PDF-Seiten 40–58, 104–105, 408–419)
**Punkte:** werden aus allen Tests berechnet (sichtbare + versteckte Tests)
**Abgaben:** maximal 2

## Hintergrund

In Java werden **alle** Argumente per **Call-by-Value** übergeben: Der Parameter ist eine lokale
Kopie des Arguments. Bei einem Objekt oder Feld ist dieser Wert aber eine **Referenz**
(ein Pfeil auf das Objekt). Deshalb kann eine Methode das Objekt *verändern*, aber nicht die
Variable des Aufrufers auf ein *anderes* Objekt umbiegen.

Die Klasse `Punkt` ist schon fertig. Du arbeitest in `Referenzen.java` und `Vorhersage.java`.

## Teil 1: `Referenzen`

### a) `static void verschiebe(Punkt p, int dx, int dy)`

Verschiebe den **übergebenen** Punkt um `dx` und `dy` (der Aufrufer sieht die Änderung).
Ist `p == null`, passiert nichts.

### b) `static Punkt verschoben(Punkt p, int dx, int dy)`

Gib einen **neuen** Punkt zurück, der um `dx`, `dy` verschoben ist. `p` bleibt unverändert.
Ist `p == null`, gib `null` zurück.

### c) `static void tausche(int[] feld, int i, int j)`

Vertausche `feld[i]` und `feld[j]`. Ist `feld == null` oder einer der Indizes ungültig,
passiert nichts (keine Exception!).

### d) `static Punkt[] kopiereFlach(Punkt[] punkte)`

Gib ein **neues Feld** gleicher Länge zurück, das **dieselben** Punkt-Objekte enthält
(nur die Referenzen werden kopiert). Bei `null` gib `null` zurück.

### e) `static Punkt[] kopiereTief(Punkt[] punkte)`

Gib ein neues Feld zurück, in dem jeder Punkt ein **neues** Objekt mit denselben Koordinaten ist.
Änderungen an der Kopie dürfen das Original nicht beeinflussen.
`null`-Einträge bleiben `null`. Bei `punkte == null` gib `null` zurück.

## Teil 2: Was gibt dieses Programm aus? (wie in der Klausur)

Löse diesen Teil **auf Papier, ohne den Code auszuführen.** Zeichne Kästchen (Variablen) und Pfeile
(Referenzen). Trage danach die 8 Ausgaben in dieser Reihenfolge in `Vorhersage.antworten()` ein.

```java
static void aendere(int x, Punkt p, int[] feld) {
    x = 10;
    p.x = 20;
    feld[0] = 30;
    p = new Punkt(40, 40);
    p.y = 50;
    feld = new int[]{60};
}

public static void main(String[] args) {
    int a = 1;
    Punkt q = new Punkt(2, 3);
    int[] f = {4, 5};
    aendere(a, q, f);
    System.out.println(a);                 // (1)
    System.out.println(q.x);               // (2)
    System.out.println(q.y);               // (3)
    System.out.println(f[0]);              // (4)
    System.out.println(f.length);          // (5)
    Punkt r = q;
    r.x = 7;
    System.out.println(q.x);               // (6)
    Punkt s = new Punkt(7, 3);
    System.out.println(q == s ? 1 : 0);    // (7)
    System.out.println(r == q ? 1 : 0);    // (8)
}
```

Die Antworten werden nur von den **versteckten** Tests geprüft.
