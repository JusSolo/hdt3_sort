package uvg.edu.gt;

import java.util.ArrayList;
import java.util.List;

public class RadixSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(List<T> lista) {
        if (lista.isEmpty() || !(lista.get(0) instanceof Integer)) {
            throw new IllegalArgumentException("RadixSort solo funciona con listas de enteros.");
        }

        @SuppressWarnings("unchecked")
        List<Integer> intList = (List<Integer>) lista;

        // Find the maximum number to determine the number of digits
        int maxNumber = findMaxNumber(intList);
        int maxDigits = countDigits(maxNumber);

        // Perform radix sort using counting sort for each digit place
        for (int place = 1; place <= maxDigits; place++) {
            countingSort(intList, place);
        }
    }

    private void countingSort(List<Integer> intList, int place) {
        int n = intList.size();
        int range = 10;  // Radix sort for decimal numbers

        List<Integer> output = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            output.add(0);
        }

        int[] count = new int[range];

        // Initialize count array
        for (int i = 0; i < range; i++) {
            count[i] = 0;
        }

        // Count occurrences of digits at the specified place
        for (Integer num : intList) {
            count[(num / place) % range]++;
        }

        // Update count array to store the position of each element in the output array
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int num = intList.get(i);
            output.set(count[(num / place) % range] - 1, num);
            count[(num / place) % range]--;
        }

        // Copy the sorted elements back to the original list
        for (int i = 0; i < n; i++) {
            intList.set(i, output.get(i));
        }
    }


    private int findMaxNumber(List<Integer> intList) {
        int max = intList.get(0);
        for (Integer num : intList) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return (int) Math.floor(Math.log10(Math.abs(number))) + 1;
    }
}
