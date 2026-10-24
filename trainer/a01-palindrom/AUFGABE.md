# Aufgabe 01: Palindrome und Felder umdrehen

**Thema:** Schleifen über Felder (Folien Teil 5, PDF-Seiten 250–283)
**Punkte:** werden aus allen Tests berechnet (sichtbare + versteckte Tests)
**Abgaben:** maximal 2

## Hintergrund

Ein **Palindrom** ist eine Folge, die vorwärts und rückwärts gelesen gleich ist,
zum Beispiel `{1, 2, 3, 2, 1}` oder das Wort `"Anna"`.

Du arbeitest nur in der Klasse `FeldUebungen` (Datei `src/main/java/eidi/a01/FeldUebungen.java`).
Ändere **keine** Methodennamen, Parameter, Rückgabetypen und keinen Paketnamen,
sonst kompilieren die Tests nicht und du bekommst 0 Punkte.

## Teilaufgaben

### a) `istPalindrom(int[] feld)`

Gib `true` zurück, wenn das Feld ein Palindrom ist, sonst `false`.

- Ein leeres Feld und ein Feld mit genau einem Element sind Palindrome.
- Ist `feld == null`, gib `false` zurück.
- Das Feld darf **nicht verändert** werden.

### b) `istPalindrom(String wort)`

Gib `true` zurück, wenn das Wort ein Palindrom ist. **Groß- und Kleinschreibung wird ignoriert**:
`"Anna"` und `"Rentner"` sind Palindrome, `"Java"` nicht.

- Der leere String `""` ist ein Palindrom.
- Ist `wort == null`, gib `false` zurück.
- Hinweis: `wort.charAt(i)` liefert das Zeichen an Position `i`, `wort.length()` die Länge.
  `Character.toLowerCase(c)` wandelt ein Zeichen in einen Kleinbuchstaben um.

### c) `umgedreht(int[] feld)`

Gib ein **neues** Feld zurück, das die Elemente von `feld` in umgekehrter Reihenfolge enthält.

- Das übergebene Feld darf **nicht verändert** werden.
- Ist `feld == null`, gib `null` zurück.

### d) `umdrehen(int[] feld)`

Drehe das übergebene Feld **in-place** um, d. h. ohne ein zweites Feld anzulegen.
Die Methode hat den Rückgabetyp `void`: Der Aufrufer sieht die Änderung trotzdem. Warum?
(Stichwort: Call-by-Value mit Referenzen, Folien PDF-Seite 408–419.)

- Ist `feld == null`, passiert nichts (keine Exception).

## Hinweise

- Die Tests in `src/test/java` sind die **sichtbaren Tests**. Bei der Abgabe laufen zusätzlich
  **versteckte Tests**, die vor allem Grenzfälle prüfen (leer, ein Element, gerade/ungerade Länge, `null`).
- Schreib dir zum Ausprobieren gern eine eigene `main`-Methode.
