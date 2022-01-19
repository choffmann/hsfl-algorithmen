# 4. Übung zur Vorlesung Algorithmen

## 1 - Suchen eines Elementes

In dieser Aufgabe geht es darum, die Laufzeit verschiedener Methoden zum Suchen eines Elementes zu vergleichen.

- Implementieren Sie eine statische Methode

  ```java
  static <T> boolean contains(List<T> list, T value)
  ```

  die den angegebenen Wert in der Liste sucht.

- Implementieren Sie außerdem Objektmethoden

  ```java
  boolean contains(T value)
  ```

  in den Klassen `SLList` und `ArrayList`.

- Messen Sie, wie lange die Methode `contains` zum Suchen eines Elementes maximal benötigt. Verwenden Sie einmal die Klasse `ArrayList` und einmal die Klasse `SLList` und vergleichen Sie die Ergebnisse. Messen Sie dabei, wie lange die Methode zum Suchen eines Elementes in einer Liste mit `100.000` Elementen benötigt. Überlegen Sie sich, wie die Liste aussehen muss, um die _worst case_-Laufzeit der Methode zu messen. Die Klasse `Measure` enthält bereits Code, mit dem gemessen werden kann, wie viel Zeit eine Methode zur Ausführung benötigt.

- Erklären Sie große Unterschiede in den Laufzeiten der vier Methoden. Geringe zeitliche Unterschiede können Sie ignorieren.

## 2 - Laufzeit der `add`-Methode

In dieser Aufgabe sollen Sie sich mit der Laufzeit des Erzeugens einer Liste beschäftigen.

- Erzeugen Sie eine `ArrayList` mit `100.000` Elementen, indem Sie jeweils das Element an Index `0` einfügen und messen Sie, wie lange das Erzeugen dieser Liste benötigt.

- Erzeugen Sie eine `SLList` mit `100.000` Elementen, indem Sie jeweils das Element an Index `0` einfügen und messen Sie, wie lange das Erzeugen dieser Liste benötigt.

- Erklären Sie den Unterschied in den Laufzeiten der beiden Methoden.
