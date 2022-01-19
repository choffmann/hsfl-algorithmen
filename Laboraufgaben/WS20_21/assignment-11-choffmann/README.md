# 11. Übung zur Vorlesung Algorithmen

## 1 - Rucksackproblem mittels *Backtracking*
In dieser Aufgabe sollen Sie die folgende Methode implementieren.

``` java
static int backtrack(ArrayList<Item> items, int maxWeight)
```

Definieren Sie zuerst ein Objekt `Item`, das einen Wert und ein Gewicht hat.

Die Methode `backtrack` löst das 0-1-Rucksackproblem mit Hilfe von *Backtracking* und liefert die Summe der Werte der Gegenstände, die in den Rucksack gepackt werden.

Der rekursive Algorithmus probiert mit Hilfe von *Backtracking* alle Möglichkeiten aus, Gegenstände in den Rucksack zu packen.
Definieren Sie dazu eine rekursive Hilfsmethode, die zusätzlich den Index des Elementes erhält, das aktuell betrachtet wird.
Ihr Algorithmus soll den Gegenstand dann einmal in den Rucksack packen und einmal nicht und von den beiden Ergebnissen das bessere zurückliefern.

Schreiben Sie einen Testfall, der testet, dass Ihre Implementierung für das Beispiel für das 0-1-Rucksackproblem aus Kapitel _4.5 Greedy_ das richtige Ergebnis liefert.

## (Optional) 2 - Erweiterung des Rucksackproblems mittels *Backtracking*
Schreiben Sie die folgende Methode.

``` java
static List<Item> backtrackList(ArrayList<Item> items, int maxWeight)
```

Diese Methode funktioniert wie die Methode `backtrack` aus der vorherigen Aufgabe. Im Unterschied zur vorherigen Aufgabe liefert diese Methode aber nicht den Wert des Rucksacks zurück sondern eine Liste von Gegenständen, die in den Rucksack gepackt wurden.
