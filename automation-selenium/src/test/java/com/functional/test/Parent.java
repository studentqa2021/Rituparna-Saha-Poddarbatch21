package com.functional.test;

public class Parent {
	//static int[]a= {4,6,7};
	//static int [] arrayName = {12,16,19};
	//static int[] myArray = {2,3,3,4,5,6,6};
public void getDuplicate(int[] myArray) {
		//System.out.println(Arrays.toString(a));
		//System.out.println(a[2]);
	//	System.out.println(a.length);
		//System.out.println("the total number in my array ="+arrayName.length);
		for(int i =0;i<myArray.length;i++) {//1st loop
			for(int j =(i+1);j<myArray.length;j++) {//2nd loop
				if(myArray[i] == myArray[j]) {
					System.out.println(myArray[i]+"===="+myArray[j]);
					System.out.println("found my duplicate value"+ myArray[j]);
				}
			}
		}
	
} public static void main(String[] args) {
	int[] myArray = {2,3,3,4,5,6,6};
	new Parent().getDuplicate(myArray);
}
}
