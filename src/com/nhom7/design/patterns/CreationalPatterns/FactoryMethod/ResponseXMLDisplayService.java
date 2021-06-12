package com.nhom7.design.patterns.CreationalPatterns.FactoryMethod;

public class ResponseXMLDisplayService extends XMLParserService{

	@Override
	protected XMLParser getParser() {
		return new ResponseXMLParser();
	}

}
