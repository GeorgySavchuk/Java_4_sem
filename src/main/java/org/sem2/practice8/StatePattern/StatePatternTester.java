package org.sem2.practice8.StatePattern;

public class StatePatternTester {
    public static void test() {
        Context context = new Context();
        context.request();
        context.setState(new ConcreteState2());
        context.request();
    }
}
