package com.capgemini.test;

import java.util.Arrays;

/**
 * Simple check to see if the given string is an anagram of another string
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * 
 * @author jtimbang
 *
 */
public class AnagramCheck {
	
	public static void main(String[] args) {
		
		String word1 = "stop";
		String word2 = "pots";
		
		char [] charArray1 = word1.toCharArray();
		char [] charArray2 = word2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2))) {
			System.out.println("Anagrams");

		} else {
			System.out.println("Not anagrams");
		}
	}
}