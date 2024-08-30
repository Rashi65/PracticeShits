package StringsPackage;

import java.util.*;

public class kLengthSubstringNoRepeatedChars {

	public static int ksubstring(String s, int k) {
		if (s.length() < k)
			return 0;

		int result = 0;
		Set<Character> chars = new HashSet<>();
		int left = 0;
		for (int right = 0; right < s.length(); ++right) {
			char c = s.charAt(right);
			while (chars.contains(c) || right - left + 1 > k) {
				chars.remove(s.charAt(left));
				++left;
			}
			chars.add(c);
			if (right - left + 1 == k) {
				++result;
			}
		}
		return result;
	}

	public static void main(String args[]) {
		String s = "rashigupta";
		int x = 5;
		int z = ksubstring(s, x);
		System.out.println(z);
	}
}
