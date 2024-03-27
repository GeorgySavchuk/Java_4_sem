package org.sem2.practice7.AdapterPattern;

public class AdapterPatternTester {
    public static void test() {
        Database database = new Adapter();
        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
