package StringsPackage;

import java.util.HashMap;
import java.util.Map;

public class AnagramsResult {
	public static void main(String args[]) {
		String arr1[] = { "abc", "bcd", "efg","aab"};
		String arr2[] = { "xyz", "dce", "abcd","ccb" };
		int result[] = resultOfAnagrams(arr1, arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] resultOfAnagrams(String arr1[], String arr2[]) {
		int resultArray[] = new int[arr1.length];
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			String word1 = arr1[i];
			String word2 = arr2[i];

			if (word1.length() != word2.length()) {
				resultArray[i] = -1;
				continue;
			} else {
				Map<Character, Integer> map = new HashMap<>();
				for (int j = 0; j < word1.length(); j++) {
					char ch = word1.charAt(j);
					if (map.containsKey(ch)) {
						map.put(ch, map.get(ch) + 1);
					} else {
						map.put(ch, 1);
					}
				}
				for (int z = 0; z < word2.length(); z++) {
					char ch1 = word2.charAt(z);
					if (map.containsKey(ch1)) {
						map.put(ch1, map.get(ch1) - 1);
					}
				}
				for (Map.Entry<Character, Integer> d : map.entrySet()) {
					sum += d.getValue();
				}
				map.clear();
			}
			resultArray[i] = sum;
			sum = 0;

		}

		return resultArray;
	}
}
