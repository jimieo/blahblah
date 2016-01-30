package blahblah;

import java.util.Scanner;

public class justdoit {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a temp in Fahrenheit: ");		
		double input = scnr.nextDouble(); 
		double fahrenheit = input;

		double celcius = (5.0/9) * (fahrenheit - 32);
		System.out.println(+ fahrenheit + " in celcius is " + celcius);
	}
}
