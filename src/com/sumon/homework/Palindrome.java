package com.sumon.homework;

public class Palindrome {
	public boolean checkPalindrome(int num) {
	int rev=0,r,temp=0;
	temp=num;
	while (temp>0) {
		r=temp%10;
		rev=(rev*10)+r;
		temp=temp/10;
	}
	return num==rev?true:false;
	}
}
