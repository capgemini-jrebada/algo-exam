package com.capgemini.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question
 *
 * Given an array of integers, segregate even and odd numbers on an array of integer.
 * All even numbers should be on the left side and odd numbers will be on the right side.
 * The output will be how many swap or moves were there.
 */
public class SegregateEvenOddNumbers {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(12,34,45,9,8,90,3));
        int left = 0, right = input.size() - 1, moves = 0;

        while (left < right) {

            // check left and look for even
            while (input.get(left) % 2 == 0) {
                left++;
            }

            // check right and look for odd
            while (input.get(right) % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = input.get(left);
                input.set(left, input.get(right));
                input.set(right, temp);

                left++;
                right--;
                moves++;
            }
        }

        System.out.println(moves);
        System.out.println(Arrays.toString(input.toArray()));
    }
}
