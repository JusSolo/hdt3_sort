package uvg.edu.gt;

import java.util.List;

public class QuikSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(List<T> lista) {
        quicksort(lista, 0, lista.size() - 1);
    }
    private void quicksort(List<T> lista, int low, int high) {
        if (low < high) {
            // Partition the list, and get the index of the pivot element
            int pivotIndex = partition(lista, low, high);

            // Recursively sort the sublists on both sides of the pivot
            quicksort(lista, low, pivotIndex - 1);
            quicksort(lista, pivotIndex + 1, high);
        }
    }
    private int partition(List<T> lista, int low, int high) {
        // Choose the pivot element (in this case, the element at the high index)
        T pivot = lista.get(high);

        // Index of smaller element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (lista.get(j).compareTo(pivot) <= 0) {
                i++;

                // Swap lista[i] and lista[j]
                T temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        // Swap lista[i+1] and lista[high] (move pivot to its correct position)
        T temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(high));
        lista.set(high, temp);

        // Return the index of the pivot element
        return i + 1;
    }
}
