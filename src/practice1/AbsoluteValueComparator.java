package practice1;

import java.util.Comparator;

public class AbsoluteValueComparator<T extends Number> implements Comparator<T> {
    @Override
    public int compare(T a, T b) {
        return Double.compare(Math.abs(a.doubleValue()), Math.abs(b.doubleValue()));
    }
}
