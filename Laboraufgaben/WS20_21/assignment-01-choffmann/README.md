# 1. Übung zur Vorlesung "Algorithmen"


## 1 - Array-Methoden

Implementieren Sie eine statische Methode `expandArray`, die ein Array von Objekten erhält und ein Array mit den gleichen Elementen liefert, das aber doppelt so groß ist wie das übergebene Array. Ihre Implementierung soll den folgenden Testfall erfüllen.

``` java
@Test
public void testExpandArray() {
    Object[] a = { "a", "b", "c", "d", "e" };
    Object[] b = Arrays.expandArray(a);

    assertEquals(2 * a.length, b.length);
    for (int i = 0; i < a.length; i++) {
        assertEquals(a[i], b[i]);
    }
}
```

Implementieren Sie eine statische Methode `shiftElements`, die ein Array und eine Zahl erhält. Alle Elemente mit einem Index größer gleich `i` werden im Array um eine Position nach rechts verschoben. Ihre Implementierung soll den folgenden Testfall erfüllen.

``` java
@Test
public void testShiftElements() {
    Object[] a = { "a", "b", "c", "d", "e" };
    Object[] b = a.clone();
    int i = 2;
    Arrays.shiftElements(a, i);

    for (int j = 0; j < i; j++) {
        assertEquals(b[j], a[j]);
    }
    for (int j = i; j < a.length - 1; j++) {
        assertEquals(b[j], a[j + 1]);
    }
}
```

## 2 - Klasse `ArrayList`

Implementieren Sie die Methoden `isEmpty`, `size`, `get` und `add` des abstrakten Datentyps “Liste”.
Die Anzahl der Elemente in der Liste können Sie als Attribut in der Klasse `ArrayList` speichern.
Verwenden Sie zur Speicherung der Einträge der Liste ein Array vom Typ `Object[]`.
Implementieren Sie die Methode `add` mit Hilfe der drei Schritte in Abbildung 2.3 des Skriptes.
Verwenden Sie die Methoden `expandArray` und `shiftElements`, die Sie bereits implementiert haben.
Stellen Sie zwei Konstruktoren zur Verfügung, einen der eine initiale Kapazität für das Array nimmt und einen der als initiale Kapazität `10` verwendet.
An einer Stelle müssen Sie den Typ `Object` in den generischen Typ `T` casten, verwenden Sie dort die Annotation `@SuppressWarnings("unchecked")`, um die Warnung zu unterdrücken.
Details zur Verwendung der Annotation finden Sie zum Beispiel unter <http://openbook.rheinwerk-verlag.de/javainsel/03_010.html#u3.10.5>.

Implementieren Sie eine weitere Klasse mit einer `main`-Methode, die Ihre Implementierung nutzt.
Fügen Sie fünf Elemente in eine Liste ein und geben Sie die Elemente der Liste mit Hilfe einer Schleife auf der Konsole aus.

Ihre Implementierung soll die zur Verfügung gestellten Testfälle erfüllen.

**Hinweis:** Sie müssen in Ihren Aufgaben keine Fehlerbehandlung durchführen, das heißt, wir gehen davon aus, dass die Methoden immer korrekt aufgerufen werden.
Zum Beispiel gehen wir davon aus, dass die Methode `get` nur mit einem Index aufgerufen wird, der auch tatsächlich existiert.
