package me.pravc.leetcode;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class LongestSubstringTest {
  @Test
  public void exampleTest() {
        assertEquals(LongestSubstring.lengthOfLongestSubstring("abcabcbb"), 3);
  }
  
  @Test
  public void oneCharRepeat() {
        assertEquals(LongestSubstring.lengthOfLongestSubstring("bbbbb"), 1);
  }
  
  @Test
  public void twoCharRepeat() {
        assertEquals(LongestSubstring.lengthOfLongestSubstring("aaaabbb"), 2);
  }
  
  @Test
  public void longestAtTheBeginning() {
      assertEquals(LongestSubstring.lengthOfLongestSubstring("abcdabca"), 4);
  }
  
  @Test
  public void longestAtTheEnd() {
      assertEquals(LongestSubstring.lengthOfLongestSubstring("abcabcde"), 5);
  }
  
  @Test
  public void longestInTheMiddle() {
      assertEquals(LongestSubstring.lengthOfLongestSubstring("abcabcdabc"), 4);
  }
  
  @Test
  public void longUniqueSequence() {
      assertEquals(LongestSubstring.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"), 26);

  }
}
