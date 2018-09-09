package ch03_prj_travelTimeCalculator;

import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// user output
		System.out.println("Welcome to the Travel Calculator\n");
		Scanner sc = new Scanner(System.in);
		// variables
		double miles = 0.0;
		double mph = 0.0;
		double hours = 0.0;
		double minutes = 0.0;
		String choice = "y";
		// while loop
		while (!choice.equalsIgnoreCase("n")) {
			// user input
			System.out.print("Enter miles driven:\t");
			miles = sc.nextDouble();
			System.out.print("Enter miles per hour:\t");
			mph = sc.nextDouble();
			// the math is wrong, but the code works
			hours = Math.round(miles / mph);
			minutes = (miles % mph);
			// output
			System.out.println("Estimated travel time:\n" + "---------------------\n" + "Hours:\t        " + hours
					+ "\n" + "Minutes:\t" + minutes + "\n");

			System.out.print("Continue:\t(y/n)");
			choice = sc.next();

		}
		// goodbye, close scanner
		System.out.println("Goodbye");
		sc.close();

	}

}
