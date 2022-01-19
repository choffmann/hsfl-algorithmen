# 10. Übung zur Vorlesung Algorithmen  

In dieser Übung sollen sie einen Sortieralgorithmus mit Hilfe von _Divide and Conquer_ implementieren.

## 1 - Evaluation

Führen Sie die Online-Evaluation der Veranstaltung durch.
Sie haben zu diesem Zweck eine Mail mit den Zugangsdaten erhalten.
Bitte nehmen Sie sich ausreichend Zeit für die Bewertung der Veranstaltung.


## 2 - Fusionieren von sortierten Arrays

Implementieren Sie zuerst die folgende Methode.

```java
static int[] fuse(final int[] source, final int start1, final int end1, final int start2, final int end2)
```

Diese Methode erhält ein Array, in dem die Bereiche `start1` bis einschließlich `end1` und `start2` bis einschließlich `end2` jeweils aufsteigend sortiert sind.
Die Methode liefert als Ergebnis ein Array, das alle Einträge von `start1` bis `end1` und von `start2` bis `end2` enthält und insgesamt sortiert ist.

**Hinweis:** Um diese Methode zu implementieren, benötigen Sie drei Zähler.
Zähler 1 beschreibt, an welchem Index im Bereich `start1` bis `end1` Sie aktuell sind.
Zähler 2 beschreibt, an welchem Index im Bereich `start2` bis `end2` Sie aktuell sind.
Zähler 3 beschreibt, an welchem Index im Ergebnisarray Sie aktuell sind.
Aus den beiden Bereichen schreiben Sie dann jeweils das kleinere der beiden Elemente in das Ergebnisarray.


## 3 - Sortieren mittels _Divide and Conquer_

Definieren Sie zuerst die folgende Funktion.

```java
static void copy(final int[] source, final int[] target, final int offset)
```

Diese Methode kopiert die Einträge aus `source` in das Array `target` und startet in `target` bei Index `offset`.

Definieren Sie mit Hilfe von _Divide and Conquer_ die folgende Funktion.

```java
static void sort(final int[] array)
```

Diese Funktion sortiert ein Array, indem es das Array in zwei Teile zerlegt und diese rekursiv sortiert.
Das rekursive Sortieren liefert zwei Teile, die beide einzeln sortiert sind.
Die beiden sortierten Teile werden dann mit Hilfe von `fuse` und `copy` in einen großen sortierten Teil umgewandelt.
