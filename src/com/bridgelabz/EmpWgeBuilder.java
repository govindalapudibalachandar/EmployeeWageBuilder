package com.bridgelabz;

public class EmpWgeBuilder {

	public static void main(String[] args) {
		 
		System.out.println("Welcome To Employee Wage Computation");
		
		int IS_FULL_TIME = 1;
		int RATE_PER_HOUR = 20;
		
		int emphrs = 0;
		 int empwage=0;
		
		Double empcheck = Math.floor(Math.random () *10) %2;
		if (empcheck==IS_FULL_TIME)
			emphrs = 8;
		empwage = emphrs * RATE_PER_HOUR;
		
		System.out.println("EmpWage :"+empwage);
		
		

	}

}