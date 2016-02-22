package com.sumon.homework;

public class NonTrailingZero {
		public String getNonTrailingZero(String num) {
			String[] numbers=num.split(",");
			String counter="";
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i]=="0") {
					counter+=1;	
				}
				
			}
			return counter;
		}
}
