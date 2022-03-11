package com.capgemini.test;

import java.util.Arrays;
import java.util.List;

/**
Write a function that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [-1, -3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [-1,000,000..1,000,000].

 * @author jtimbang
 *
 */
		
public class SmallestPositiveInteger {	
	public static void main (String args[]) {
		
		boolean hasInt = true;		
    	List<Integer> arr = Arrays.asList(1,2,3,4,5,8,9,12);
		int smallestValue = 1;
		
		while (hasInt) {
			if (arr.contains(smallestValue)) {
				smallestValue++;
			} else {
				hasInt = false;
			}
		}
		System.out.println (smallestValue);
	}
}
