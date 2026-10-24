# EidI-Trainer (wie Artemis)

Übungsaufgaben im Stil von Artemis für *Einführung in die Informatik* (TUM, Java).
Jede Aufgabe ist ein eigenes Maven-Modul mit Aufgabenstellung, Code-Gerüst und sichtbaren JUnit-Tests.

| Aufgabe | Thema | Folien (PDF-Seiten) |
|:--|:--|:--|
| [a01-palindrom](a01-palindrom/AUFGABE.md) | Schleifen über Felder, Palindrome, Feld umdrehen | 250–283 |
| [a02-rational](a02-rational/AUFGABE.md) | Klassen, Konstruktoren, `equals` vs. `==`, ggT | 34–66, 76, 129 |
| [a03-referenzen](a03-referenzen/AUFGABE.md) | Referenzen, Call-by-Value, flache/tiefe Kopie, „Was gibt das aus?“ | 40–58, 104–105, 408–419 |
| [a04-kinosaal](a04-kinosaal/AUFGABE.md) | 2D-Felder, verschachtelte Schleifen | 360–387 |
| [a05-sortieren](a05-sortieren/AUFGABE.md) | Sortieren durch Einfügen, binäre Suche, Mischen | 250–419 |
| [a06-liste](a06-liste/AUFGABE.md) | Einfach verkettete Liste | 420–531 |

## So arbeitest du

1. **Öffnen:** In IntelliJ *File → Open* und den Ordner `trainer/` wählen (nicht eine einzelne Aufgabe).
   IntelliJ erkennt das Maven-Projekt und lädt JUnit automatisch.
2. **Lesen:** `AUFGABE.md` der Aufgabe zweimal lesen.
3. **Lösen:** Im Gerüst steht in jeder Methode `throw new UnsupportedOperationException("TODO");`.
   Lösche diese Zeile und schreibe deine Lösung. Methodennamen, Parameter, Rückgabetypen und
   Paketnamen **nicht ändern**, sonst kompilieren die Tests nicht (= 0 Punkte, wie in Artemis).
4. **Testen:** Rechtsklick auf `src/test/java` der Aufgabe → *Run 'All Tests'*.
   Das sind nur die **sichtbaren** Tests; so oft du willst.
5. **Abgeben:** Commit + Push, dann im Projekt-Thread „Abgabe a01“ (usw.) schreiben.
   Claude lässt dann sichtbare **und versteckte** Tests laufen und meldet Punkte und die Namen der
   fehlgeschlagenen Tests.

## Regeln wie in der Prüfung

- **Höchstens 2 Abgaben pro Aufgabe.** Es zählt die bessere Abgabe.
- Versteckte Tests prüfen vor allem Grenzfälle: leeres Feld, `null`, ein Element, negative Zahlen,
  erster/letzter Index. Überlege dir diese Fälle selbst, bevor du abgibst.
- Musterlösungen und versteckte Tests liegen **nicht** in diesem Repository.

Kommandozeile (optional): `mvn test -pl a01-palindrom`
