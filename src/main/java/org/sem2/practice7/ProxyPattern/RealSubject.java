package org.sem2.practice7.ProxyPattern;

public class RealSubject implements Subject{
    private String url;
    public RealSubject(String url) {
        this.url = url;
    }
    @Override
    public void request() {
        System.out.println("Делается запрос на адрес: " + url + "...");
    }
}
