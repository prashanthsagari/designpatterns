package com.dp.designpatterns.template;

public class TestTemplatePattern {

	public static void main(String[] args) {
		AbstractClass ab = new Subclass();
		ab.templateMethod();
	}

}
