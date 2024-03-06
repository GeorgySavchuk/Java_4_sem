package practice7.ProxyPattern;

public class ProxySubject implements Subject{
    private RealSubject realSubject;
    private String url;
    public ProxySubject(String url) {
        this.url = url;
    }

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject(url);
        }
        realSubject.request();
    }
}
