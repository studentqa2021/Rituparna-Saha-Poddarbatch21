package com.generic.code;

public class Swapvalues {
	public void getValue(int a,int b) {
		System.out.println("a value before swap =" +a);
		System.out.println("b value before swap =" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value after swap ="+ a);
		System.out.println("b value after swap =" +b);
	}
	public void getReverse(String country) {
		int count=0;
		for(int i=0;i<country.length();i++) {
			if(country.charAt(i)=='a'){
				count++;
			}
		}
		System.out.println("tottal a ="+count);
	}
public void getArray() {
	int c[]= {100,200,300,400,500};
	System.out.println(c.length);
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
}
}
