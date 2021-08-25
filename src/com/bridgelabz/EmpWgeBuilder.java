package com.bridgelabz;

public class EmpWgeBuilder {

	public static void main(String[] args) {
		 
		System.out.println("Welcome To Employee Wage Computation");
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int RATE_PER_HOUR = 20;
		
		int emphrs = 0;
		 int empwage=0;
		
		Double empcheck = Math.floor(Math.random () *10) %3;
		if (empcheck==IS_FULL_TIME)
			emphrs = 8;
		if (empcheck==IS_PART_TIME)
			emphrs = 4;
		empwage = emphrs * RATE_PER_HOUR;
		
		System.out.println("EmpWage :"+empwage);
		
		

	}

}