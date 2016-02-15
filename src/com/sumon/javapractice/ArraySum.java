package com.sumon.javapractice;

public class ArraySum {
	public int AddArray(String[] array) {
		int result=0;
		for (String element : array) {
			result += Integer.parseInt(element);
		}
		return result;
	}
}
