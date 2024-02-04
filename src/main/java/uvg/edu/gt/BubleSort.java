package uvg.edu.gt;

import java.util.List;

public class BubleSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(List<T> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    // Swap elements if they are in the wrong order
                    T temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }
}
