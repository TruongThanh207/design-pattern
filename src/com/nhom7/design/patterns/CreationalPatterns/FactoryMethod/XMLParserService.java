package com.nhom7.design.patterns.CreationalPatterns.FactoryMethod;

public abstract class XMLParserService {
	public void display(){
        XMLParser parser = getParser();
        parser.parse();
    }
 
    protected abstract XMLParser getParser();
 
}
