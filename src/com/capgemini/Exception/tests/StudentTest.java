package com.capgemini.Exception.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.Exception.AgeNotWithinRangeException;
		import com.capgemini.Exception.NameNotValidException;
import com.capgemini.Exception.Student;

class StudentTest {	

			
			@Test
			void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
				//	assertEquals(null,new Student(11,"Sr",21,"Java"));
					assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Pallavi",22,"Java"));
					NameNotValidException assertThrows = assertThrows(NameNotValidException.class,()-> new Student(11,"Pallavi1",21,"Java"));
			}
	}


