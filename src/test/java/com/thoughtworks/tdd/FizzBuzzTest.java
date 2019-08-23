package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	@Test
	public void should_print_one() throws Exception{
	
		FizzBuzz fizzBuzz = new FizzBuzz();
		String a = fizzBuzz.getName(1);
		Assertions.assertEquals("1", a);	
	}
	@Test
	public void should_print_Fizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String threeString = fizzBuzz.getName(3);
		Assertions.assertEquals("Fizz", threeString);
	}
	@Test
	public void should_print_Buzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String fiveString = fizzBuzz.getName(5);
		Assertions.assertEquals("Buzz", fiveString);
	}
	@Test
	public void should_print_Whizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String sevenString = fizzBuzz.getName(7);
		Assertions.assertEquals("Whizz", sevenString);
	}
	@Test
	public void should_print_FizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String fifteenString = fizzBuzz.getName(15);
		Assertions.assertEquals("FizzBuzz", fifteenString);
	}
	@Test
	public void should_print_FizzWhizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String twentyoneString = fizzBuzz.getName(21);
		Assertions.assertEquals("FizzWhizz", twentyoneString);
	}
	@Test
	public void should_print_BuzzWhizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String thirtyfiveString = fizzBuzz.getName(35);
		Assertions.assertEquals("BuzzWhizz", thirtyfiveString);
	}
	@Test
	public void should_print_FizzBuzzWhizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String hundredfiveString = fizzBuzz.getName(105);
		Assertions.assertEquals("FizzBuzzWhizz", hundredfiveString);
	}
}
