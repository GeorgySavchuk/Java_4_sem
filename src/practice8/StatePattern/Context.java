package practice8.StatePattern;

public class Context {
    private State currentState;

    public Context() {
        currentState = new ConcreteState1();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handle();
    }
}
