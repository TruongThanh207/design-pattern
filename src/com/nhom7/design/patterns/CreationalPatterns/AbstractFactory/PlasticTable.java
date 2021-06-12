package com.nhom7.design.patterns.CreationalPatterns.AbstractFactory;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}

