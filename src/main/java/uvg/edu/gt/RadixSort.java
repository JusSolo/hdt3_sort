package uvg.edu.gt;

import java.util.ArrayList;
import java.util.List;
// el algoritmo se adapto del encontrado en la siguiente página: https://www.javatpoint.com/radix-sort
public class RadixSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(List<T> lista) {
        if (lista.isEmpty() || !(lista.get(0) instanceof Integer)) {
            throw new IllegalArgumentException("RadixSort solo funciona con listas de enteros.");
        }
        List<Integer> intList = (List<Integer>) lista;
        int max = getMax(intList);

        for (int place = 1; max / place > 0; place *= 10)
            countingSort(intList, place);
    }
    private int getMax(List<Integer> lista) {
        int max = lista.get(0);
        for (Integer num : lista) {
            if (num > max)
                max = num;
        }
        return max;
    }

    private int min(int a, int b){
        if(a<b)
            return a;
        return b;
    }

    private void countingSort(List<Integer> list, int place) {
        int n = list.size();
        int range = min(10,n);

        List<Integer> output = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            output.add(0);
        }

        int[] count = new int[range];

        for (int i = 0; i < n; i++) {
            count[(list.get(i) / place) % range]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int num = list.get(i);
            output.set(count[(num / place) % range] - 1, num);
            count[(num / place) % range]--;
        }

        list.clear();
        list.addAll(output);
    }




}
