package practice8.StrategyPattern;

public class Tester {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
