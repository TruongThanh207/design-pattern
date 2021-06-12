package com.nhom7.design.patterns.CreationalPatterns.AbstractFactory;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}