package practice7.AdapterPattern;

public class Tester {
    public static void main(String[] args) {
        Database database = new Adapter();
        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
