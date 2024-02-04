package uvg.edu.gt;

import java.util.List;

public interface Sort <T extends Comparable<T>>{
    void sort(List<T> lista);
}
