package uk.ac.aber.dcs.CommandLineCalculator.tests;

import uk.ac.aber.dcs.CommandLineCalculator.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandLineCalculatorTestCase {

	CalculatorLogic c;
	
	@Before
	public void setUp() throws Exception {
		c = new CalculatorLogic();
	}

	@Test
	public void testAdd() {
		assertEquals("2+1 should be 3",3,c.add(2,1));
	}
	
	@Test
	public void testSub() {
		assertEquals("3-1 should be 2",2,c.sub(3,1));
	}
	
	@Test
	public void testMul() {
		assertEquals("2*1 should be 2",2,c.mul(2,1));
	}	
	
	@Test
	public void testDiv() {
		assertEquals("2/1 should be 2",2,c.div(2,1));
	}	

}
