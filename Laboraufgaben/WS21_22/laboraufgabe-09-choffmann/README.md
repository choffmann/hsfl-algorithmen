# 9. Übung zur Vorlesung Algorithmen


## 1 - Dynamische Programmierung

In dieser Aufgabe sollen Sie die Implementierung der Methode `subsetsum` aus der Vorlesung mit Hilfe von dynamischer Programmierung effizienter machen.
Ändern Sie die Methode aus der Vorlesung so ab, dass sie dynamische Programmierung nutzt.
Die Laufzeit der Implementierung soll im _worst case_ in `O(n * k)` sein, wobei `n` die Länge des Arrays ist und `k` die Größe der Summe, nach der gesucht wird.


## 2 - Teilstrings erzeugen

In dieser Aufgabe sollen Sie mit Hilfe von Backtracking eine Methode

```java
static List<String> substrings(final String str)
```

implementieren.
Diese Methode liefert alle Teilstrings von `str` in einer Liste zurück.
Die Teilstrings von `"abc"` sind zum Beispiel `""`, `"a"`, `"b"`, `"c"`, `"ab"`, `"bc"`, `"ac"` und `"abc"`.

**Tipps:** Orientieren Sie sich an der Implementierung der Methode `subsetsum` in der Vorlesung.
Definieren Sie eine Hilfsmethode, die als weiteres Argument den `String` erhält, der bisher konstruiert wurde.
Erinnern Sie sich außerdem an die Implementierung der Methode `entries` auf einem Baum.