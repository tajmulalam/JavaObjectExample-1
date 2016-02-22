package com.sumon.homework;

public class TrailingZeros {
	public int  getTrailingZero(int num) {
		int counter=0;
		while (num%10==0) {
			counter+=1;
			num=num/10;
		}
		return counter;
	}
}
