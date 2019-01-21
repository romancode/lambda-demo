package com.krosstek;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda01 {

	public static void main(String[] args) {
		
		//Using the test method of Predicate
		Predicate<String> stringlen = (s) -> s.length() < 10;
		System.out.println(stringlen.test("Orange") + " - Orange is less than 10");
		
		//Function example
		Function<Integer,String> converter = (num) -> Integer.toString(num);
		System.out.println("length of 100: "+ converter.apply(100).length());
		
		//Supplier example
		Supplier<String> s = () -> "java is fun";
		System.out.println(s.get());
		
		//Binary operator example
		BinaryOperator<Integer> add = (a,b) -> a+b;
		System.out.println("add 25 + 15: " + add.apply(25, 15));
		
		//Unary operator example
		UnaryOperator<String> str = (msg) -> msg.toLowerCase();
		System.out.println(str.apply("This is Roman!"));
		
	}

}
