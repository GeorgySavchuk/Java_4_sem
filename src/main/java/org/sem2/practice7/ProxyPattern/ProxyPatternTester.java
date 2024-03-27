package org.sem2.practice7.ProxyPattern;

public class ProxyPatternTester {
    public static void test() {
        Subject subject = new ProxySubject("https://github.com/GeorgySavchuk/music-app");
        subject.request();
    }
}
