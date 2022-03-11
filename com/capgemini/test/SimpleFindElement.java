package com.capgemini.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/*
 * Complete the 'findNumber' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY arr
 *  2. INTEGER k
 */
public class SimpleFindElement {
	
	public static void main(String[] args) throws IOException {
    	List<Integer> arr = Arrays.asList(1,2,3,4,5);
    	int k = 1;
        String result = findNumber(arr, k);
        System.out.println(result);

    }

	public static String findNumber(List<Integer> arr, int k) {
	  	
    	boolean hasElement = arr.contains(k);
    	return hasElement? "YES":"NO";
    }

}