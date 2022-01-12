package com.company;

public class PracticeEncapsulation {
	private static int salary = 5000;//global access modifier

	public static int getSalary() {//getter method
		return salary;
	}

	public static void setSalary(int salary) {//setter method it is static void method
		
		PracticeEncapsulation.salary = salary;
	}

}
