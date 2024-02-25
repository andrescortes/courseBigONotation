package algorithm.functional;

import java.util.List;

@FunctionalInterface
public interface DataFilter<T> {
    List<T> filter(List<T> data);
}
