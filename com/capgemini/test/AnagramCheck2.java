package com.capgemini.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given 2 arrays:
 * a = [tea, ate, eating]
 * b = {eat, tar, drinking]
 * 
 * per matching index of each array, find whether:
 * 1. the strings do not match in length, output -1
 * 2. the strings are anagrams, output 0
 * 3. how many chars do you need to make them anagrams, output n
 * 
 * example:
 * 0, 1, -1
 * 
 * 0 because eat and tea are anagrams
 * 1 because you need to replace either r or e to make them anagrams
 * -1 because the strings don't match in length
 * 
 * @author jtimbang
 *
 */
public class AnagramCheck2 {
	
	public static void main(String[] args) {
		
		List <String> a = new ArrayList<String>();
		a.add("tea");
		a.add("jesset");
		a.add("act");
		List <String> b = new ArrayList<String>();
		b.add("ate");
		b.add("kharel");
		b.add("actssss");
		String [] word1 = new String[a.size()];
				a.toArray(word1);
		String [] word2 = new String[b.size()]; 
				b.toArray(word2);
		for (int i=0; i <= word1.length - 1; i++) {

			if (word1[i].length() != word2[i].length()) {
				System.out.println(-1);		
			} else {
				char [] charArray1 = word1[i].toCharArray();
				char [] charArray2 = word2[i].toCharArray();
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);
				
				if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2))) {
					System.out.println(0);
				} else {					
				    List<Character> list = new LinkedList<>();
				    for (char aChar : charArray1) {
				        list.add(aChar);
				    }
				    for (char c : charArray2) {
				        if (list.contains(c)) {
				            list.remove(Character.valueOf(c));				            
				        }
				    }				    
				    System.out.println (list.size());
				}				
			}
		}		
	}
}