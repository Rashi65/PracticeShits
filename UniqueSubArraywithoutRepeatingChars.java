package StringsPackage;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueSubArraywithoutRepeatingChars {
	// this soln has time comp-o(2n)== length of String
//	public static int lengthOfLongestSubstring(String s) {
//		int windowStart = 0;
//		int windowEnd = 0;
//		int n = s.length();
//		HashSet<Character> set = new HashSet<>();
//		int maxLength = Integer.MIN_VALUE;
//		int len = 0;
//		while (windowEnd < n) {
//			char ch = s.charAt(windowEnd);
//			// remove all elements upto first occurence of this character
//			if (set.contains(ch)) {
//				while (windowStart < windowEnd && set.contains(ch)) {
//					set.remove(s.charAt(windowStart));
//					windowStart++;
//				}
//			}
//			set.add(ch);
//			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
//			windowEnd++;
//		}
//		return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;
//	}
	// has compl->o(n)
	public static int lengthOfLongestSubstring(String s) {
		int windowStart = 0;
		int windowEnd = 0;
		int n = s.length();
		// HashSet<Character> set = new HashSet<>();
		HashMap<Character, Integer> map = new HashMap<>();
		int maxLength = Integer.MIN_VALUE;
		int len = 0;
		while (windowEnd < n) {
			char ch = s.charAt(windowEnd);
			// remove all elements upto first occurence of this character
//			if (set.contains(ch)) {
//				while (windowStart < windowEnd && set.contains(ch)) {
//					set.remove(s.charAt(windowStart));
//					windowStart++;
//				}
//			}
			if (map.containsKey(ch) && map.get(ch) >= windowStart) {
				windowStart = map.get(ch) + 1;
			}
			// set.add(ch);
			map.put(ch, windowEnd);
			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
			windowEnd++;
		}
		return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;

	}

	public static void main(String args[]) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}
