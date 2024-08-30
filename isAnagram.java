package StringsPackage;

import java.util.Arrays;

public class isAnagram {

	public static void main(String args[]) {
		String s = "anagram";
		String t = "aangram";
		boolean result=isGram(s, t);
		System.out.println(result);
	}

	public static boolean isGram(String s, String t) {
		char arr1[] = s.toCharArray();
		char arr2[] = t.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String s1 = new String(arr1);
		//System.out.println(s1);
		return new String(arr1).equals(new String(arr2));
	}
}
