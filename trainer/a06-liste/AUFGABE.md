# Aufgabe 06: Einfach verkettete Liste

**Thema:** Abstrakte Datentypen, verkettete Listen (Folien Teil 6, PDF-Seiten 420–531;
die Klasse `List` mit `info` und `next` auf PDF-Seite ~245)
**Punkte:** werden aus allen Tests berechnet (sichtbare + versteckte Tests)
**Abgaben:** maximal 2

## Hintergrund

Eine einfach verkettete Liste besteht aus **Knoten**. Jeder Knoten speichert einen Wert `info`
und eine Referenz `next` auf den nächsten Knoten; beim letzten Knoten ist `next == null`.
Die Klasse `IntListe` merkt sich nur den ersten Knoten im Attribut `kopf`. Ist die Liste leer,
gilt `kopf == null`.

```
kopf ──> [3|•]──> [8|•]──> [5|null]
```

Die Klasse `Knoten` ist fertig. Du arbeitest nur in `IntListe.java`.
**Benutze keine Klassen aus `java.util`** (kein `ArrayList`, keine `LinkedList`);
das wird bei der Abgabe geprüft. Zeichne dir für jede Methode die Pfeile auf Papier!

## Teilaufgaben

### a) `void vorneEinfuegen(int x)`

Füge `x` als neuen ersten Knoten ein.

### b) `void hintenAnhaengen(int x)`

Füge `x` als neuen letzten Knoten ein. Achtung bei der leeren Liste.

### c) `int laenge()`

Anzahl der Knoten.

### d) `int get(int index)`

Wert des Knotens an Position `index` (ab 0). Ist der Index ungültig, wirf eine
`IndexOutOfBoundsException`: `throw new IndexOutOfBoundsException("Index " + index);`

### e) `boolean entferneErstes(int x)`

Entferne den **ersten** Knoten mit dem Wert `x`. Gib `true` zurück, wenn ein Knoten entfernt wurde,
sonst `false`. Denke an den Sonderfall, dass der zu löschende Knoten der `kopf` ist.

### f) `void umdrehen()`

Drehe die Reihenfolge der Liste um, **ohne neue Knoten anzulegen**: Biege nur die
`next`-Referenzen um. (Klassiker in der Klausur!)

### g) `String toString()`

Wie in der Vorlesung: `"[3, 8, 5]"`, leere Liste `"[]"`.
