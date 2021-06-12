package com.nhom7.design.patterns.BehaviorialPatterns.Iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}