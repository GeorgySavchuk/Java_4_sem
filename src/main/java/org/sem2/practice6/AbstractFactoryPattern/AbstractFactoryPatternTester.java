package org.sem2.practice6.AbstractFactoryPattern;

import java.util.Scanner;
public class AbstractFactoryPatternTester {
    public static void test() {
        AbstractFactory[] abstractFactories = {new GenerationSayerFactory(), new PetSayerFactory()};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name:");
        String name = scanner.next();
        System.out.println("First abstract factory :");
        abstractFactories[0].createProductA().relateToName(name);
        abstractFactories[0].createProductB().relateToName(name);
        System.out.println("Second abstract factory :");
        abstractFactories[1].createProductA().relateToName(name);
        abstractFactories[1].createProductB().relateToName(name);
    }
}
