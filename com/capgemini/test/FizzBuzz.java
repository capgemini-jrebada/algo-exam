package com.capgemini.test;

import java.util.stream.IntStream;

/**
 * Write a program that prints the numbers from 1 to 100 and for multiples of
 * '3' print "Fizz" instead of the number and for the multiples of '5' print
 * "Buzz"
 * 
 * @author jtimbang
 *
 */
public class FizzBuzz {

	public static void main(String args[]) {
		streamSolution();
		nonStreamSolution();
	}
		
	
	private static void streamSolution() {

		IntStream.rangeClosed(0, 100).mapToObj(
        i -> i % 3 == 0 ?
                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                (i % 5 == 0 ? "Buzz" : i))
        .forEach(System.out::print);
	}
	
	private static void nonStreamSolution() {

		int n = 100; //depending on question this can be anything

		for (int i = 1; i <= n; i++) {			
				if (i % 15 == 0)
					System.out.print("FizzBuzz" + " ");
				else if (i % 5 == 0)
					System.out.print("Buzz" + " ");
				else if (i % 3 == 0)
					System.out.print("Fizz" + " ");
				else
					System.out.print(i + " ");
			}
		}
}
	
	

	
	

