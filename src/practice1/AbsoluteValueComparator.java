package practice1;

import java.util.Comparator;

public class AbsoluteValueComparator<T extends Number> {
    private final Comparator<T> comp = (a, b) -> Double.compare(Math.abs(a.doubleValue()), Math.abs(b.doubleValue()));
    public String doCompare(T a, T b) {
        int result = comp.compare(a, b);
        return switch (result) {
            case 1 -> "Первое число больше";
            case -1 -> "Второе число больше";
            case 0 -> "Числа равны";
            default -> "";
        };
    }
}
