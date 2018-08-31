package com.capgemini.Exception.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Exception.CountryNotValidException;
import com.capgemini.Exception.EmployeeNameInvalidException;
import com.capgemini.Exception.MyCalculator;
import com.capgemini.Exception.TaxCalculator;
import com.capgemini.Exception.TaxNotEligibleException;

class TaxCalculatorTest {

	@Test
	void testcalculateTaxWithValidInputs()throws TaxNotEligibleException,CountryNotValidException,EmployeeNameInvalidException {
		assertEquals(3300,TaxCalculator.calculateTax("jack",true,55000),0.2);
	}
		@Test
		void testcalculateTaxWithInValidName() {
		Exception e;
		e=assertThrows(Exception.class,()->TaxCalculator.calculateTax("",true,70000));
		assertEquals("Employee name cannot be empty",e.getMessage());
		e=assertThrows(Exception.class,()->TaxCalculator.calculateTax(null,true,70000));
		assertEquals("Employee name cannot be empty",e.getMessage());
		
	}
@Test
void testcalculateTaxNotEligibleException() {
	Exception e;
	e=assertThrows(Exception.class,()->TaxCalculator.calculateTax("jack",true,5000));
	assertEquals("Employee need not to pay the tax",e.getMessage());
	e=assertThrows(Exception.class,()->TaxCalculator.calculateTax("tim",true,9000));
	assertEquals("Employee need not to pay the tax",e.getMessage());
	
}
@Test
void testcalculateCountryNotValidException() {
	Exception e;
	e=assertThrows(Exception.class,()->TaxCalculator.calculateTax("jack",false,5000));
	assertEquals("Employee should be indian to calculate tax",e.getMessage());
	e=assertThrows(Exception.class,()->TaxCalculator.calculateTax("tim",false,9000));
	assertEquals("Employee should be indian to calculate tax",e.getMessage());
}
}
