package de.choffmann.algorithms;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList(5);
        arrayList.add(0, 10);
        arrayList.add(1, 20);
        arrayList.add(2, 30);
        arrayList.add(3, 40);
        arrayList.add(4, 50);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
