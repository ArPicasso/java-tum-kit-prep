# Aufgabe 02: Rationale Zahlen

**Thema:** Klassen, Objekte, Konstruktoren, `equals` vs. `==` (Folien Teil 1–2, PDF-Seiten 34–66, 76, 129)
**Punkte:** werden aus allen Tests berechnet (sichtbare + versteckte Tests)
**Abgaben:** maximal 2

## Hintergrund

Wie in der Vorlesung stellen wir eine rationale Zahl (einen Bruch) durch zwei `int`-Attribute
`zaehler` und `nenner` dar. Ein Objekt der Klasse `Rational` soll immer **normalisiert** sein:

1. **gekürzt**: Zähler und Nenner haben keinen gemeinsamen Teiler größer als 1,
2. der **Nenner ist positiv** (das Vorzeichen steht im Zähler),
3. die Zahl 0 wird immer als `0/1` gespeichert.

Beispiel: `new Rational(6, -8)` speichert `zaehler = -3`, `nenner = 4`.

Du arbeitest nur in `src/main/java/eidi/a02/Rational.java`. Ändere keine Signaturen.

## Teilaufgaben

### a) `static int ggT(int a, int b)`

Berechne den größten gemeinsamen Teiler mit dem **Euklidischen Algorithmus** (mit `while`-Schleife).

- Das Ergebnis ist immer `>= 0`. Negative Argumente werden wie ihre Beträge behandelt: `ggT(-12, 18) == 6`.
- `ggT(a, 0) == |a|` und `ggT(0, 0) == 0`.

### b) Konstruktor `Rational(int zaehler, int nenner)`

Speichere den Bruch **normalisiert** (siehe oben). Benutze dafür `ggT`.

- Ist `nenner == 0`, wirf eine `IllegalArgumentException`:
  `throw new IllegalArgumentException("Nenner darf nicht 0 sein");`

### c) Getter `getZaehler()` und `getNenner()`

### d) `Rational addiere(Rational r)` und `Rational multipliziere(Rational r)`

Gib ein **neues** `Rational`-Objekt mit dem Ergebnis zurück.
Weder `this` noch `r` dürfen verändert werden.

- a/b + c/d = (a·d + c·b) / (b·d)
- a/b · c/d = (a·c) / (b·d)

### e) `boolean equals(Rational r)`

Gib `true` zurück, wenn `this` und `r` **denselben Wert** haben (nicht: dasselbe Objekt!).
Ist `r == null`, gib `false` zurück.

Frage zum Nachdenken: Was liefert `new Rational(1, 2) == new Rational(2, 4)`, und warum?

### f) `String toString()`

- Normalfall: `"3/4"`, `"-1/2"`
- Ist der Nenner 1, nur den Zähler: `"2"`, `"0"`, `"-5"`
