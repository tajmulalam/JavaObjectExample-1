package com.sumon.homework;

public class Prime {

	public boolean checkEven(int n) {
		return n % 2 == 0 ? true : false;
	}

	public boolean checkPrime(int n) {

		if (n == 2) {
			return true;
		}

		if (checkEven(n) == true || n <= 1) {
			return false;
		}
		int limit = n / 2;
		for (int i = 2; i < limit; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
