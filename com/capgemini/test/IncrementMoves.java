package com.capgemini.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Question
 *
 * Given an array of integers, increment by 1 each numbers n-1 until all numbers in the array are equal.
 * The output should be the number of moves to make the array of numbers equal.
 *
 * Iteration | Array
 * 1         | [6, 6, 5, 4, 4]
 * 2         | [6, 7, 6, 5, 5]
 * 3         | [7, 7, 7, 6, 6]
 * 4         | [7, 8, 8, 7, 7]
 * 5         | [8, 9, 8, 8, 8]
 * 6         | [9, 9, 9, 9, 9]
 *
 * Output = 6
 *
 *
 * First Solution = Brute Force
 *
 * 1. First sort by descending order so we always start by not incrementing the biggest number
 * 2. Get the largest which is in index=0
 * 3. Then loop through the arrays until all integers in array is equal
 * 4. Largest will always be the first index and we skipped incrementing it, so we only increment n-1 integers
 *
 * Issue
 *
 * It will hit the timeout error in Hackerrank for very large array of integers passed.
 * It seems there is a 4 minutes time limit within Hackerrank.
 */
public class IncrementMoves {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,5,6));
        int moves = 0;

        while (!isArrayEqual(input)) {
            Collections.sort(input, Collections.reverseOrder());
            int largest = input.get(0);

            for (int i=1; i<input.size(); i++) {
                if (input.get(i) <= largest) {
                    input.set(i, input.get(i)+1);
                }
            }

            System.out.println(Arrays.toString(input.toArray()));
            moves++;
        }
        System.out.println(moves);
    }

    private static boolean isArrayEqual(List<Integer> input) {
        return input.stream().distinct().count() <= 1;
    }
}
