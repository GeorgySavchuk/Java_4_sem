package org.sem2.practice6.AbstractFactoryPattern;

public class GenerationSayerFactory implements AbstractFactory{
    @Override
    public AbstractProduct createProductA() {
        return new FatherSayerProduct();
    }

    @Override
    public AbstractProduct createProductB() {
        return new GrandfatherSayerProduct();
    }
}
