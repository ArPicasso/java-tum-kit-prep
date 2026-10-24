# Aufgabe 05: Sortieren und Suchen

**Thema:** Sortieren durch Einfügen, binäre Suche, Mischen sortierter Felder
(Folien Teil 5, PDF-Seiten 250–419; binäre Suche auch in Teil 8)
**Punkte:** werden aus allen Tests berechnet (sichtbare + versteckte Tests)
**Abgaben:** maximal 2

Du arbeitest nur in `src/main/java/eidi/a05/Sortieren.java`. Ändere keine Signaturen.
**Benutze keine fertigen Bibliotheksmethoden** wie `Arrays.sort` oder `Arrays.binarySearch`
(das wird bei der Abgabe zusätzlich geprüft).

## Teilaufgaben

### a) `static void sortiereDurchEinfuegen(int[] feld)`

Sortiere das Feld **aufsteigend** und **in-place** mit **Sortieren durch Einfügen** (Insertion Sort):
Gehe von links nach rechts; das aktuelle Element wird so lange nach links verschoben,
bis links davon nur noch kleinere oder gleich große Elemente stehen.
Bei `null` passiert nichts.

### b) `static boolean istSortiert(int[] feld)`

`true`, wenn das Feld aufsteigend sortiert ist (gleiche Werte nebeneinander sind erlaubt).
Leeres Feld: `true`. `null`: `false`.

### c) `static int binaereSuche(int[] sortiert, int x)`

Das Feld ist aufsteigend sortiert und enthält **keine doppelten Werte**.
Gib den Index von `x` zurück, oder `-1`, wenn `x` nicht vorkommt.
Arbeite **iterativ** (mit einer Schleife) und halbiere in jedem Schritt den Suchbereich
mit zwei Grenzen `links` und `rechts`. Bei `null`: `-1`.

### d) `static int[] mische(int[] a, int[] b)`

`a` und `b` sind jeweils aufsteigend sortiert. Gib ein **neues** Feld der Länge
`a.length + b.length` zurück, das alle Elemente aus beiden enthält und sortiert ist.
Laufe dabei mit zwei Indizes gleichzeitig durch `a` und `b` (nicht einfach alles kopieren und
dann sortieren!). Ist eines der Felder `null`, behandle es wie ein leeres Feld.

Beispiel: `mische({1, 4, 9}, {2, 3, 10, 11})` liefert `{1, 2, 3, 4, 9, 10, 11}`.
