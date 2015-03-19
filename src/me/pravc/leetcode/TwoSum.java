package me.pravc.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * @author praveen
 *
 */
public class TwoSum {

	public static int[] findIndexesForSum(int[] numbers, int target) {
		int[] output = new int[2];
		output[0] = output[1] = 0;
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
			if (numMap.containsKey(target - numbers[i])) {
				output[0] = numMap.get(target - numbers[i]);
				output[1] = i + 1;
				return output;
			} else {
				numMap.put(numbers[i], i + 1);
			}

		}

		// not found
		return output;
	}

}
