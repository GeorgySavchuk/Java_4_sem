package org.sem2.practice5;

public class ClassHolderSingleton {
    private ClassHolderSingleton() {}

    private static class SingletonHolder {
        public static final ClassHolderSingleton HOLDER_INSTANCE = new ClassHolderSingleton();
    }

    public static ClassHolderSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
