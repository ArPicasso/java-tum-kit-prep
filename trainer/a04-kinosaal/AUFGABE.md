# Aufgabe 04: Kinosaal

**Thema:** Zweidimensionale Felder, verschachtelte Schleifen (Folien PDF-Seiten 360–387)
**Punkte:** werden aus allen Tests berechnet (sichtbare + versteckte Tests)
**Abgaben:** maximal 2

## Hintergrund

Ein Kinosaal hat `reihen` Reihen mit je `plaetzeProReihe` Plätzen. Wir speichern die Belegung
in einem 2D-Feld `boolean[][] belegt`: `belegt[reihe][platz] == true` bedeutet, der Platz ist gebucht.
Reihen und Plätze werden **ab 0** gezählt; Reihe 0 ist die vorderste Reihe.

Du arbeitest nur in `src/main/java/eidi/a04/Kinosaal.java`. Ändere keine Signaturen.

## Teilaufgaben

### a) Konstruktor `Kinosaal(int reihen, int plaetzeProReihe)`

Lege das Feld an; am Anfang sind alle Plätze frei.
Ist `reihen <= 0` oder `plaetzeProReihe <= 0`, wirf eine `IllegalArgumentException`.

### b) `boolean istFrei(int reihe, int platz)`

`true`, wenn der Platz existiert und frei ist. Für ungültige Koordinaten `false`.

### c) `boolean buche(int reihe, int platz)`

Buche den Platz. Gib `true` zurück, wenn das geklappt hat.
War der Platz schon belegt oder gibt es ihn nicht, gib `false` zurück und ändere nichts.

### d) `int freiePlaetze()`

Anzahl aller freien Plätze im ganzen Saal.

### e) `int freiePlaetzeInReihe(int reihe)`

Anzahl der freien Plätze in einer Reihe. Bei ungültiger Reihe: `-1`.

### f) `int findeBlock(int reihe, int anzahl)`

Suche in der Reihe `anzahl` **nebeneinanderliegende** freie Plätze.
Gib den **kleinsten** Startplatz eines solchen Blocks zurück, sonst `-1`.
Auch bei ungültiger Reihe oder `anzahl <= 0`: `-1`.

Beispiel (`.` frei, `X` belegt), Reihe `. X . . . X`:
`findeBlock(r, 3) == 2`, `findeBlock(r, 1) == 0`, `findeBlock(r, 4) == -1`.

### g) `int bucheBlock(int anzahl)`

Eine Gruppe möchte `anzahl` Plätze nebeneinander. Suche **von vorne nach hinten** die erste Reihe,
in der es einen passenden Block gibt (benutze `findeBlock`), und buche dort den Block.
Gib die Reihe zurück, oder `-1`, wenn es nirgends passt (dann wird nichts gebucht).

### h) `String toString()`

Jede Reihe eine Zeile, `.` für frei und `X` für belegt, Zeilen mit `"\n"` getrennt,
**kein** Zeilenumbruch am Ende. Ein Saal 2×3 mit gebuchtem Platz (0, 1): `".X.\n..."`.
