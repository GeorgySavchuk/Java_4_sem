package org.sem2.practice5;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}
    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
            return instance;
        }
        return instance;
    }
}
