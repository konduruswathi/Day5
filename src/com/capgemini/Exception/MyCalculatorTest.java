package com.capgemini.Exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInputs() throws Exception {
		assertEquals(243,MyCalculator.Power(3,5));
		assertEquals(16,MyCalculator.Power(2,4));
		assertEquals(32,MyCalculator.Power(2,5));
	}
		@Test
		void testPowerWithZeroInputs() {
			Exception e;
		e=assertThrows(Exception.class,()->MyCalculator.Power(0,0));
		
		assertEquals("n and p should not be zero",e.getMessage());
		
	}
@Test
void testPowerWithNegativeInputs() {
	Exception e;
	e=assertThrows(Exception.class,()->MyCalculator.Power(-2,-5));
	assertEquals("n and p should not be negative",e.getMessage());
	e=assertThrows(Exception.class,()->MyCalculator.Power(-2,5));
	assertEquals("n and p should not be negative",e.getMessage());
	e=assertThrows(Exception.class,()->MyCalculator.Power(2,-5));
	assertEquals("n and p should not be negative",e.getMessage());
}

}
