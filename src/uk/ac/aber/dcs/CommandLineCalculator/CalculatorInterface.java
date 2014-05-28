package uk.ac.aber.dcs.CommandLineCalculator;

import java.util.Scanner;


/**
 * A simple example java command line calculator
 * This class contains the user interface
 * @author Colin Sauze
 *
 */

public class CalculatorInterface {
	
	CalculatorLogic c;
	
	public CalculatorInterface()
	{
		c = new CalculatorLogic();
	}
	
    /**
        gets user input from the keyboard and calls the appropriate calculator logic method
    */
	public void getUserInput()
	{
		int result=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int a = keyboard.nextInt();
		
		System.out.println("enter an operation (+,-,* or /)");
		String op = keyboard.next();
		
		System.out.println("enter another integer");
		int b = keyboard.nextInt();
		
		
		switch(op) {
			case "+":
				result=c.add(a,b);
				break;
			case "-":
				result=c.sub(a,b);
				break;
			case "*":
				result=c.mul(a,b);
				break;
			case "/":
				result=c.div(a,b);
				break;
		}
		
		System.out.println(a + " " + op + " " + b + " = " + result);

	}
	
	public static void main(String args[])
	{
		CalculatorInterface ci = new CalculatorInterface();
		ci.getUserInput();
	}

}
