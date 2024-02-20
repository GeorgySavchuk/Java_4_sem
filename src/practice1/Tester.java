package practice1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        Double b = scanner.nextDouble();
        AbsoluteValueComparator<Double> comparatorTester = new AbsoluteValueComparator<>();
        System.out.print(comparatorTester.doCompare(a, b));
    }
}
