package practice7.ProxyPattern;

public class Tester {
    public static void main(String[] args) {
        Subject subject = new ProxySubject("https://github.com/GeorgySavchuk/music-app");
        subject.request();
    }
}
