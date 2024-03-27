package org.sem2.practice3;


import java.util.ArrayList;
import java.util.List;

public class SyncList<T>{
    private List<T> list;

    public SyncList() {
        this.list = new ArrayList<>();
    }

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized T get(int index) {
        return list.get(index);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized boolean isEmpty() {
        return list.isEmpty();
    }
}
