# 7. Übung zur Vorlesung Algorithmen

## 1 - Binäre Suche

In der Vorlesung haben wir die Methode `binarySearch` mit Hilfe einer Schleife implementiert. Implementieren Sie mit Hilfe von Rekursion die folgende Methode.

```java
static boolean binarySearchRec(int[] array, int x)
```

## 2 - Summe mittels _Divide and Conquer_

Implementieren Sie mit Hilfe von _Divide and Conquer_ die folgende Methode, welche die Summen der Zahlen im Array berechnet.

```java
static int sum(int[] array)
```

- Haben Sie die Methode mit einer Schleife oder mit Rekursion implementiert? Begründen Sie Ihre Wahl.

- In welcher Größenordnung liegt die Laufzeit Ihrer Methode in etwa? Begründen Sie Ihre Antwort.

- Können Sie sich einen Anwendungsfall vorstellen, in dem die Implementierung mittels _Divide and Conquer_ einen Vorteil gegenüber einer naiven Implementierung bietet?

## 3 - Magischer Index

Implementieren Sie die folgende Methode mit Hilfe von _Divide and Conquer_.

```java
static Integer magic(int[] array)
```

Die Methode erhält ein Array mit unterschiedlichen, aufsteigend sortierten Zahlen.
Die Methode soll den Index `i` im Array zurückliefern, an dem `array[i] = i` gilt.
Falls kein Index im Array diese Eigenschaft hat, soll die Methode `null` liefern.

**Hinweis:**
Nehmen wir an, für den mittleren Index `mid` gilt `array[mid] < mid`.
Wo müssen Sie dann den magischen Index suchen?
