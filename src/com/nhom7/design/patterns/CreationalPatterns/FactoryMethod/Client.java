package com.nhom7.design.patterns.CreationalPatterns.FactoryMethod;

public class Client {
	public static void main(String[] args) {
        XMLParserService service = new ResponseXMLDisplayService();
        service.display();
 
        service = new ErrorXMLDisplayService();
        service.display();
 
    }
}
