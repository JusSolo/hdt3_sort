package uvg.edu.gt;

import java.util.ArrayList;
import java.util.List;

public class GnomeSort <T extends Comparable<T>> implements Sort<T> {
    /**
     * Metodo de sorteo de la clase
     *
     * @param lista Lista a ser ordenada
     */
    @Override
    public void sort(List<T> lista) {
            int index = 0;

            while (index < lista.size()) {
                if (index == 0)
                    index++;
                if (lista.get(index).compareTo(lista.get(index-1))>0)
                    index++;
                else {
                    T temp;
                    temp = lista.get(index);
                    lista.set(index, lista.get(index - 1));
                    lista.set(index - 1, temp);
                    index--;
                }
            }
            return;
    }

}
