package com.capgemini.test;
/**
 * 
 * This finds a number in a Fibonacci sequence.
 * A Fibonacci sequence is a series of numbers where the next number is found by adding up the two numbers before it
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * 
 * @author jtimbang
 *
 */
public class FibonacciImpl {
	public static int getNthFib (int n) {
		if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;
		} else {
			return  getNthFib(n - 2) + getNthFib(n -1);
		}	
	}
	
	public static void main (String args[]) {
		System.out.println (FibonacciImpl.getNthFib(9));
	}
}