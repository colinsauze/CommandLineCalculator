package uk.ac.aber.dcs.CommandLineCalculator;

import java.util.Scanner;


/**
 * A simple example java command line calculator
 * This class contains the logic methods which perform addition, subtraction, multiplication and division 
 * @author Colin Sauze
 *
 */
public class CalculatorLogic {
	
    /**
    adds two integers together. 
    @param a the first integer to add
    @param b the second integer to add
    @return the sum of a and b
    */
    
	public int add(int a,int b)
	{
		return a+b;
	}
	
    /**
    subtracts one integer from another
    @param a the first integer
    @param b the second integer, whcich will be subtracted from a
    @return the result of subtracing b from a
    */
	public int sub(int a,int b)
	{
		return a-b;
	}
	
    /**
    multiplies two integers together
    @param a the first integer
    @param b the second integer
    @return the result of multiplying a and b
    */
	public int mul(int a,int b)
	{
		return a*b;
	}
	
    /**
    divides two integers
    @param a the integer that will act as the dividend 
    @param b the integer that will act as the divisor
    @return the result of dividing a by b. 
    */
	public int div(int a,int b)
	{
		return a/b;
	}
	
}
