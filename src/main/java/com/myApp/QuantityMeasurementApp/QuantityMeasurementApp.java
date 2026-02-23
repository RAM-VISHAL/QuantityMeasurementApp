package com.myApp.QuantityMeasurementApp;

import java.util.Scanner;

public class QuantityMeasurementApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first no.(feet): ");
		Feet first = new Feet(input.nextDouble());
		System.out.println("Enter second no. (feet): ");
		Feet second = new Feet(input.nextDouble());

		boolean result = first.equals(second);

		System.out.println("Input: " + first + " and " + second);
		System.out.println("Output: Equal (" + result + ")");
		
		 System.out.println("----------------------------------");

	        // -------- Inches Equality --------
	        System.out.println("Enter first no. (inch): ");
	        Inches firstInch = new Inches(input.nextDouble());

	        System.out.println("Enter second no. (inch): ");
	        Inches secondInch = new Inches(input.nextDouble());

	        boolean inchResult = firstInch.equals(secondInch);

	        System.out.println("Input: " + firstInch + " and " + secondInch);
	        System.out.println("Output: Equal (" + inchResult + ")");

	        input.close();
		
	}
}