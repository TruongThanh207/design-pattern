package com.nhom7.design.patterns.BehaviorialPatterns.Iterpreter;

import java.util.Date;

public class Context {
	public String expression;
    public Date date;
    public Context(Date date)
    {
        this.date = date;
    }
}
