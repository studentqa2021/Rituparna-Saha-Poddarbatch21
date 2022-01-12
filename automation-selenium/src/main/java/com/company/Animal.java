package com.company;


public class Animal {
	
	public void getMoney(){
		int age=2;
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else { System.out.println("not eligible for vote");
		}
		int num=67;
		if(num%2==0) {
			System.out.println("it is an even number");
			
		}
		else {
			System.out.println("it is a odd number");
		}
		
	}
	public void getIncome() {
		int day=3;
		if(day==1) {
			System.out.println("Monday");
		}
		else if(day==2) {
			System.out.println("Tuesday");
		}
		else if (day==3) {
			System.out.println("Wednesday");
		}
		else if (day==4) {
			
				System.out.println("Thursday");
		}
		else {
			System.out.println("invalid day");
		}
		
		
	}
	public void getSalary() {
		int day=6;
		switch(day) {
		case 1 :System.out.println("Sunday");break;
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("Tuesday");break;
		case 4 :System.out.println("Wednesday");break;
		default:System.out.println("Invalid week day");
		}
		
	}
	public void getLogin() {
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i+=2;
		}
	}
	
		
	
	
	}


