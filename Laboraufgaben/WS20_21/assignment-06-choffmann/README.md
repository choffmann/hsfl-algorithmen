# 6. Übung zur Vorlesung Algorithmen

## 1 - Suchen mittels Rekursion

Implementieren Sie die Methode `contains` in den Klassen `ArrayList` und `SLList` mit Hilfe von Rekursion. Die Methode muss dabei nicht selbst rekursiv sein, sie können auch eine rekursive Hilfsmethode verwenden.

Implementieren Sie außerdem die Methode `nodeAt` in der Klasse `SLList` mit Hilfe von Rekursion.

## 2 - Bäume

In dieser Aufgabe sollen Sie sich mit binären Bäumen beschäftigen. Ein Baum ist eine Datenstruktur ähnlich zu einer Liste. Wie eine verkettete Liste, besteht ein Baum aus Knoten. Im Unterschied zu einer Liste hat ein Knoten bei einem binären Baum zwei Nachfolger. Die Nachfolger bezeichnet mal als _linken_ und _rechten Nachfolger_. Ein Baum hat einen ausgezeichneten Knoten, der als _Wurzel_ bezeichnet wird und der “Anfang” des Baumes ist. Wie eine Liste, kann auch ein Baum leer sein. Die Knoten, die keine Nachfolger haben, werden als _Blätter_ bezeichnet. Knoten, die keine Blätter sind, werden als _innere Knoten_ bezeichnet.

Das folgende Bild stellt einen Baum dar. Der Knoten mit der Beschriftung `A` ist die Wurzel des Baumes. Die Knoten mit den Beschriftungen `A` und `B` sind innere Knoten des Baumes. Die Knoten mit den Beschriftungen `D`, `E` und `C` sind Blätter des Baumes.

![Ein Beispiel-Baum](images/trees-01.svg)

- Implementieren Sie eine Klasse `BinTreeNode`, die einen Knoten in einem binären Baum darstellt. Implementieren Sie außerdem eine Klasse `BinTree` zur Darstellung eines Baumes. Jeder Knoten soll einen Wert enthalten und der Baum soll generisch über dem Typ der Einträge sein.

- Implementieren Sie die folgenden Objektmethoden in der Klasse `BinTree` mit Hilfe von Rekursion. Dabei muss die Methode wieder nicht selbst rekursiv sein, sie können auch eine rekursive Hilfsmethode verwenden.

  - Die Methode `nodes` liefert die Anzahl der Knoten in einem Baum.

  - Die Methode `height` liefert die Höhe eines Baumes. Die Höhe ist die maximale Anzahl von Knoten, die man auf einem Pfad von der Wurzel zu einem Blatt besuchen muss.

  - Die Methode `printAll` gibt alle Einträge eines Baumes auf der Konsole aus. Die Methode soll dabei die Knoten in der Reihenfolge ausgeben, wie sie entsteht, wenn man den Baum "platt drückt". Für den Beispiel-Baum würde man zum Beispiel die Reihenfolge `D`, `B`, `E`, `A`, `C` erhalten.

  - Die Methode `mirror` liefert einen gespiegelten Baum zurück. Die Methode liefert für den Baum oben zum Beispiel den Baum unten.

![Ergebnis der Methode `mirror`](images/trees-02.svg)
