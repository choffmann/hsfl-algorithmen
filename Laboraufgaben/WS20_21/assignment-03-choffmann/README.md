# 3. Übung zur Vorlesung "Algorithmen"

## 1 - Stack

Implementieren Sie den folgenden abstrakten Datentyp mit Hilfe einer Klasse `Stack` mit einem parameterlosen Konstruktor.

| Signatur            | Beschreibung                                                                                               |
| :------------------ | :--------------------------------------------------------------------------------------------------------- |
| `boolean isEmpty()` | Liefert genau dann `true`, wenn der Stapel keine Elemente enthält.                                         |
| `void push(T e)`    | Packt das Element `e` auf den Stapel.                                                                      |
| `T pop()`           | Nimmt das oberste Element vom Stapel und liefert es zurück.                                                |
| `T peek()`          | Gibt das oberste Element vom Stapel zurück, ohne es zu entfernen.                                          |
| `boolean find(T e)` | Liefert genau dann `true`, wenn sich der Wert im Stack befindet.<br/>Ansonsten wird `false` zurückgegeben. |

Für die interne Speicherung der Daten benutzen Sie bitte die Klasse `Node`, die Sie aus der Vorlesung kennen.

Implementieren Sie die Methoden ohne die Größe des Stacks zu speichern. Überlegen Sie sich, wie Sie die Knoten am besten anordnen, um `push` und `pop` möglichst effizient zu implementieren.

## 2 - Doppelt verkettete Listen

Implementieren Sie eine doppelt verkettete Liste, indem Sie Klassen `DLNode` und `DLList` erstellen. Implementieren Sie dann die folgenden Methoden des abstrakten Datentyps Liste.

- Implementieren Sie die Methoden `isEmpty` und `size` mit Hilfe eines Attributes.

- Implementieren Sie als nächstes eine Methode `nodeAt` analog zur gleichnamigen Methode der einfach verketteten Liste.

- Ändern Sie Ihre Implementierung der Methode `nodeAt` so ab, dass der Knoten vom hinteren Ende der Liste gesucht wird, falls der gesuchte Index sich näher an diesem Ende befindet.

- Überlegen Sie sich an Hand von Beispielen auf dem Zettel, ob Ihre Implementierung korrekt funktioniert.

- Nutzen Sie die Methode `nodeAt`, um die Methode `get` zu implementieren.

- Implementieren Sie die Methode `add` mit Hilfe von Abbildung 2.9 aus dem Skript.
