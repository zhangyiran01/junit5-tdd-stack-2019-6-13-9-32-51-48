package com.thoughtworks.tdd;

public class FizzBuzz {
	
	
	
	
	public String getName(int i) {
		// TODO Auto-generated method stub
		if(i %3 ==0 && i %5 ==0 && i % 7 == 0) {
			return "FizzBuzzWhizz";
		}
		if(i %5 ==0 && i % 7 == 0) {
			return "BuzzWhizz";
		}
		if(i %3 ==0 && i % 7 == 0) {
			return "FizzWhizz";
		}
		if(i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		}
		if(i % 3 == 0) {
			return "Fizz";
		}
		
		if(i % 5 == 0) {
			return "Buzz";
		}
		if(i % 7 == 0) {
			return "Whizz";
			
		}
		return String.valueOf(i);
	}
	
	

}
