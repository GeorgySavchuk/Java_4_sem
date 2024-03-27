package org.sem2.practice7.AdapterPattern;

public class Adapter extends App implements Database{
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
