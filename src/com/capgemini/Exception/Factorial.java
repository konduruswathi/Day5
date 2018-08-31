package com.capgemini.Exception;

public class Factorial {

	public Object getFactorial(int num) throws InvalidInputException,FactorialException{
			int fact=1 ;
			if(num<2)
			{
				throw new InvalidInputException("Enter a valid input") ;
			}
			for(int i=1;i<=num;i++)
			{
				fact=fact*i ;
				if(fact<0)
				{
					throw new FactorialException("Limit exceed") ;
				}
				
			}
			return fact ;
		}
		
		
	}

