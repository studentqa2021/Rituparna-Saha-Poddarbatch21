package com.company;

public class Newman {
int a;
public Newman(int b) {
	a=b;
	System.out.println(b);
	
}
void getCommission(double d){
	System.out.println(d);
}
public static void main(String[] args) {
	Newman obj=new Newman(76);
	obj.getCommission(45.87);
	
}
}
