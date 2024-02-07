package uvg.edu.gt;

import java.util.ArrayList;
import java.util.List;

public class MergeSort <T extends Comparable<T>> implements Sort<T>{

    /**
     * Metodo de sorteo de la clase
     *
     * @param list Lista a ser ordenada
     */
    @Override
    public void sort(List<T> list) {
        if (list == null || list.size() <= 1) {
            return; // Base case: list is already sorted or empty
        }

        mergeSort(list, 0, list.size() - 1);
    }
    
    /**
     * Metodo de sorteo de la clase
     *
     * @param list Lista a ser ordenada
     */
    private void mergeSort(List<T> list, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            // Recursively sort the two halves
            mergeSort(list, start, mid);
            mergeSort(list, mid + 1, end);

            // Merge the sorted halves
            merge(list, start, mid, end);
        }
    }

    private void merge(List<T> list, int start, int mid, int end) {
        List<T> temp = new ArrayList<>(end - start + 1);

        int left = start;
        int right = mid + 1;

        // Merge the two sorted sublists into temp list
        while (left <= mid && right <= end) {
            if (list.get(left).compareTo(list.get(right)) <= 0) {
                temp.add(list.get(left++));
            } else {
                temp.add(list.get(right++));
            }
        }

        // Copy remaining elements from left sublist
        while (left <= mid) {
            temp.add(list.get(left++));
        }

        // Copy remaining elements from right sublist
        while (right <= end) {
            temp.add(list.get(right++));
        }

        // Copy elements from temp back to the original list
        for (int i = start; i <= end; i++) {
            list.set(i, temp.get(i - start));
        }
    }

}
