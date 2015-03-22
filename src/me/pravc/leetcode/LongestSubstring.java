package me.pravc.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author praveen
 *
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 1;
        Map<Character, Integer> charPositionMap = new HashMap<>();
        char[] chars = s.toCharArray();

        int begin = 0;
        for (int i = 0; i < chars.length; i++) {
            if (charPositionMap.containsKey(chars[i])) {
                int prevOccurrence = charPositionMap.get(chars[i]);
                // move position to the char next to the previous occurrence.
                int length = i - begin;
                if (length > maxLength) {
                    maxLength = length;
                }

                for (int j = begin; j <= prevOccurrence; j++) {
                    charPositionMap.remove(chars[j]);
                }

                begin = prevOccurrence + 1;
            }
            charPositionMap.put(chars[i], i);
        }

        int length = chars.length - begin;
        if (length > maxLength) {
            maxLength = length;
        }
        return maxLength;
    }
}
