package src;
import java.util.Map;
import java.util.HashMap;

public class LengthOfLongestSubstring {
	/*
	Given "abcabcbb", the answer is "abc", which the length is 3.

	Given "bbbbb", the answer is "b", with the length of 1.

	Given "pwwkew", the answer is "wke", with the length of 3.
	Note that the answer must be a substring, "pwke" is a 
	subsequence and not a substring.
	*/
	public static void main(String[] args) {
		String sample = "abcabcbb";
		System.out.println("Expected: 3");
		System.out.println("Answer: " + lengthOfLongestSubstring(sample));
	}

	public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 0) return 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int length = 0;
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				length = Math.max(length, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - length + 1);
		}
		return max;
	}
}
