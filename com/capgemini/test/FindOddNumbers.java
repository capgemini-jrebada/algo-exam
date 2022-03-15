package com.capgemini.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given two integers, l and r, print all odd numbers between l and r (l and r inclusive)
 * 
 * Complete the 'findNumber' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY arr
 *  2. INTEGER k
 */
public class FindOddNumbers {
	
	public static void main(String[] args) throws IOException {
    	int l = 1;
    	int r = 10;
        oddNumbers(l, r).stream().forEach(i -> System.out.println(i));;
        
    }

	public static List<Integer> oddNumbers(int l, int r){
		List <Integer> oddList = new ArrayList<Integer>();		
		for (int i=l; i <= r; i++){			
			if ( i % 2 != 0 ) {
				oddList.add(i);	
			}						
		}
    	return oddList;
    }

}