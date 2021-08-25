package com.bridgelabz;

public class EmpWgeBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int RATE_PER_HOUR = 20;
	

	public static void main(String[] args) {
		 
		System.out.println("Welcome To Employee Wage Computation");
	
		int emphrs = 0;
		 int empwage=0;
		
		int empcheck = (int) Math.floor(Math.random () *10) %3;
		switch ( empcheck ) 
		{
		case IS_PART_TIME:
			emphrs = 4;
			break;
		case IS_FULL_TIME:
			emphrs = 8;
			break;
		default:
			emphrs=0;
		}
		empwage = emphrs * RATE_PER_HOUR;
		
		System.out.println("EmpWage :"+empwage);
		
		

	}

}