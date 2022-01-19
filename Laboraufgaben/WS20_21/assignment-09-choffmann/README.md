# 9. Übung zur Vorlesung Algorithmen  

## 1 - Teilstrings erzeugen

In dieser Aufgabe sollen Sie eine Methode

```java
static List<String> substrings(String str)
```

implementieren, die für einen gegebenen `String` eine Liste von allen Teilstrings liefert.
Definieren Sie dazu zuerst die folgende Methode.

```java
static void substrings(String str, int i, String current, List<String> result)
```

Dabei ist `str` die Zeichenkette, von der alle Teilstrings erzeugt werden sollen und `i` ist die aktuelle Position in `str`.
Das Argument `current` enthält den Teilstring, der aktuell erzeugt wurde.
Das Argument `result` enthält eine Liste, in der alle bisher erzeugten Teilstrings gesammelt werden.
Diese Liste wird von der Methode `substrings(String)` am Ende zurückgeliefert.

Implementieren Sie Ihre Methode mit Hilfe von Rekursion.
Die Methode probiert mit Hilfe von Backtracking alle Möglichkeiten aus, Teilstrings zu erstellen.
Ihre Methode soll das Zeichen in `str` an Position `i` einmal zur aktuellen Zeichenkette `current` hinzufügen und einmal nicht.


## 2 - Passwort knacken

In dieser Aufgabe sollen Sie mit Hilfe von Backtracking eine Methode definieren, die PINs (Persönliche Identifikationsnummern) ausprobiert.
Eine PIN enthält dabei nur Ziffern.
Die Klasse `ATM` modelliert einen Geldautomat mit einer zufällig gewählten PIN.
Der Geldautomat stellt eine Methode `check(String)` zur Verfügung, mit deren Hilfe getestet werden kann, ob eine geratene PIN korrekt ist.
Implementieren Sie eine Methode `crack(int)` in der Klasse `BruteForce`, die alle möglichen PINs mit einer gegebenen Länge ausprobiert.
Implementieren Sie dazu eine Hilfsmethode

```java
private String crack(String current, int len)
```

die die bisher erzeugte PIN und die Länge als Argumente erhält.
Das Ergebnis der Methode ist die PIN, die gefunden wurde, oder `null` falls keine PIN gefunden wurde.
Die Methode probiert alle möglichen PINs aus, indem sie die aktuelle PIN `current` um jede mögliche Ziffer erweitert und die Methode jeweils rekursiv aufruft.
