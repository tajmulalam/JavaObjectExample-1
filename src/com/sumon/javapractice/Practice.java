package com.sumon.javapractice;

import java.util.Scanner;

public class Practice {

//	public static void main(String[] args) {
//		System.out.print("Enter Number: ");	
//		Scanner aScanner = new Scanner(System.in);		
//		System.out.println(new OddEven().CheckEven(aScanner.nextInt()) ? "Even Number" : "Odd Number");
//		aScanner.close();
//	}
	public static void main(String[] args) {
		
		System.out.println("Enter Array Element Ex. 10, 20, 30,40, Format: ");
		Scanner aScanner=new Scanner(System.in);	
		System.out.println("The Summation of all array element is : "+new ArraySum().AddArray(aScanner.next().split(",")));
		aScanner.close();
	}
}
