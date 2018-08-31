package com.capgemini.Exception.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.capgemini.Exception.Factorial;
import com.capgemini.Exception.FactorialException;
class FactorialTest {

	@Test
	void testgetFactorial() throws Exception {
				Factorial f1=new Factorial() ;
				assertThrows(FactorialException.class,()->f1.getFactorial(100));
				assertEquals(120,f1.getFactorial(5));
			}

			
	}


