package com.capgemini.Exception;

public class TaxCalculator {

	public static double calculateTax(String empName,boolean isIndian,double empSal)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException {
	double taxAmount=1;
	if(!isIndian)
	{
	throw new CountryNotValidException("Employee should be indian to calculate tax");
	}
	else if(empName==null||empName.equals("")) {
		throw new EmployeeNameInvalidException("Employee name cannot be empty");
	}
		
		else if(empSal>=100000)
				taxAmount=empSal*8/100;
			else if(empSal>=50000&&empSal<100000)
				taxAmount=empSal*6/100;
			else if(empSal>=30000&&empSal<50000)
				taxAmount=empSal*5/100;
			else if(empSal>=10000&&empSal<=40000)
				taxAmount=empSal*4/100;
	
			else
			{
				throw new TaxNotEligibleException("Employee need not to pay the tax");
			}
		return taxAmount;	
	}
	
	}
	
	
	

