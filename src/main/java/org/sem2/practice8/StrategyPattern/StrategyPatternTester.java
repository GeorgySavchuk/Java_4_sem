package org.sem2.practice8.StrategyPattern;

public class StrategyPatternTester {
    public static void test() {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
