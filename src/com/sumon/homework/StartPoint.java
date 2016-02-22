package com.sumon.homework;


public class StartPoint {

	public static void main(String[] args) {
		System.out.println(new Factorial().getFactorial(22));
		System.out.println(new TrailingZeros().getTrailingZero(202000));
		System.out.println(new NonTrailingZero().getNonTrailingZero("202000"));
		System.out.println(new Palindrome().checkPalindrome(1331));
		System.out.println("isPrime: " + new Prime().checkPrime(19));
	}

}
