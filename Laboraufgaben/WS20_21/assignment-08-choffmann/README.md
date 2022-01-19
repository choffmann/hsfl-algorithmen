# 8. Übung zur Vorlesung Algorithmen  

## 1 - Duplikate finden
Implementieren Sie eine Methode

``` java
static boolean containsDuplicates(String str)
```

die testet, ob ein Zeichen in der gegebenen Zeichenkette mehrfach vorkommt.

  - Implementieren Sie die Methode mit Hilfe einer Schleife und brechen Sie Ihre Suche ab, sobald Sie ein Duplikat gefunden haben. Vermeiden Sie außerdem unnötige Vergleiche.

  - In welcher Größenordnung ist die *worst case*-Laufzeit Ihrer Methode? Begründen Sie Ihre Antwort.


## 2 - Optimiertes Duplikate finden

In dieser Aufgabe sollen Sie davon ausgehen, dass das Argument `str` nur ASCII-Zeichen enthält.
Ihre Methode soll ein boolesches Array nutzen, das so viele Einträge hat wie es ASCII-Zeichen gibt.

  - Implementieren Sie mit Hilfe des booleschen Arrays eine Methode `containsDuplicatesOptimized`.
    Nutzen Sie das Array, um zu speichern, ob ein Zeichen bereits im `String` vorkam.

  - In welcher Größenordnung ist die *worst case*-Laufzeit Ihrer Methode? Begründen Sie Ihre Antwort.


## 3 - *Longest common subsequence*
In dieser Aufgabe sollen Sie sich mit dem Algorithmus zur Berechnung der *longest common subsequence* beschäftigen.

  - Die Methode `lcs` wird immer wieder mit den gleichen Argumenten aufgerufen. Schreiben Sie eine Methode `lcsDyn` und nutzen Sie dynamische Programmierung, um die Ergebnisse in einem Array nachzuschlagen, falls sie bereits berechnet wurden.
