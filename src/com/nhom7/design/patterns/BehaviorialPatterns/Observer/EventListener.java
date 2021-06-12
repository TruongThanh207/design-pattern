package com.nhom7.design.patterns.BehaviorialPatterns.Observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
