package com.company;

public class Practice { 
	public void getlogin() {
	int [] a= {20,30,40};
	System.out.println(a.length);
	System.out.println("******");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("My Array value");
		
	}
	public static void main(String[] args) {
		Practice obj= new Practice();
		obj.getlogin();
	}

}
