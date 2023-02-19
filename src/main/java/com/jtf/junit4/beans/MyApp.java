package com.jtf.junit4.beans;

public class MyApp {

	/// To test we can write a logic whether my add method is working or not 
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		Integer result =calc.add(10,400);
		System.out.println(result);
	}
}
