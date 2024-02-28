package practice5;

public class Tester {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("LazySingleton Instances equal: " + (lazySingleton1 == lazySingleton2));

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton Instances equal: " + (enumSingleton1 == enumSingleton2));

        ClassHolderSingleton classHolderSingleton1 = ClassHolderSingleton.getInstance();
        ClassHolderSingleton classHolderSingleton2 = ClassHolderSingleton.getInstance();
        System.out.println("ClassHolderSingleton Instances equal: " + (classHolderSingleton1 == classHolderSingleton2));
    }
}
