@FunctionalInterface
public interface Expression<T> {
    T apply(T num1, T num2);
}
