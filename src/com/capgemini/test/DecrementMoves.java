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
 * Second Solution - Instead of incrementing, why not get the smallest number in the array and then decrement
 * other numbers n-1 up to the smallest number. This will then avoid double loops we used in IncrementMoves.
 *
 */
public class DecrementMoves {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3,3,4,5,6));
        int moves = 0, smallest = 0;
        Collections.sort(input);
        smallest = input.get(0);

        for (int i=1; i<input.size(); i++) {
            moves += input.get(i) - smallest;
        }

        System.out.println(moves);
    }
}
