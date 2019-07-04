package com.koal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calculator=new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		//fail("Not yet implemented");
		calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
	}
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		 calculator.add(8);
	     calculator.divide(2);
	     assertEquals(4, calculator.getResult());
	}

	@Test
	public void testSquare1() {
		//fail("Not yet implemented");
		 calculator.square(2);
	     assertEquals(4, calculator.getResult());
	}

	@Test
	public void testSquare2() {
		//fail("Not yet implemented");
		 calculator.square(0);
	     assertEquals(0, calculator.getResult());
	}
	
	@Test
	public void testSquare3() {
		//fail("Not yet implemented");
		 calculator.square(-3);
	     assertEquals(9, calculator.getResult());
	}
	
	@Test
	public void testSquareRoot() {
		//fail("Not yet implemented");
		calculator.squareRoot(4);
	    assertEquals(2, calculator.getResult());
	}
	 

	

}
