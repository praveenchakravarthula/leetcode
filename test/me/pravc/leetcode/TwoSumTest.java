package me.pravc.leetcode;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.testng.annotations.Test;

public class TwoSumTest {

    @Test
    public void exampleTest() {
        int[] input = new int[] { 2, 7, 11, 15 };
        int target = 9;

        int[] output = TwoSum.findIndexesForSum(input, target);

        assertNotNull(output);
        assertEquals(output.length, 2);

        assertEquals(output[0], 1);
        assertEquals(output[1], 2);

    }

    @Test
    public void oneTtest() {
        int[] input = new int[] { 9, 7, 5, 3, 2, 1, 10 };
        int target = 6;

        int[] output = TwoSum.findIndexesForSum(input, target);

        assertNotNull(output);
        assertEquals(output.length, 2);

        assertEquals(output[0], 3);
        assertEquals(output[1], 6);
    }

    @Test
    public void negativeNumbersTest() {
        int[] input = new int[] { 10, -1, -2, 300, 400, 60, 50, 2 };
        int target = 48;

        int[] output = TwoSum.findIndexesForSum(input, target);

        assertNotNull(output);
        assertEquals(output.length, 2);

        assertEquals(output[0], 3);
        assertEquals(output[1], 7);
    }
}
