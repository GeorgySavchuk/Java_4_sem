package practice8.StatePattern;

public class Tester {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.setState(new ConcreteState2());
        context.request();
    }
}
