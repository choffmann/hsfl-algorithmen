package klausur.schnitt;

import java.util.ArrayList;
import java.util.List;

public class Schnitt {
    public static List<Integer> intersect(int[] array1, int[] array2) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            int start = 0;
            int end = array2.length - 1;
            while(start <= end && !found) {
                int mid = start + (end - start) / 2;
                int midValue = array2[mid];
                if(array1[i] < midValue) {
                    end = mid - 1;
                } else if(array1[i] > midValue) {
                    start = mid + 1;
                } else {
                    found = true;
                    numbers.add(midValue);
                }
            }
        }
        return numbers;
    }
}
