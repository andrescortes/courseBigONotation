package algorithm.functional;
@FunctionalInterface
public interface Calculate<T, U> {

    U process(T a, U b);

    default int add(int a, int b) {
        return a + b;
    }

    default int subtract(int a, int b) {
        return a - b;
    }
}
