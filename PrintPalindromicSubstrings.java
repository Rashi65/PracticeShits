package StringsPackage;

public class PrintPalindromicSubstrings {

	/// abccbc
	public static void main(String args[]) {
		String s = "abccbc";
		solution(s);
	}

	public static void solution(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				if (isPlaindrome(ss) == true)
					System.out.println(ss);
			}
		}
	}

	public static boolean isPlaindrome(String s2) {
		int i = 0;
		int j = s2.length() - 1;
		while (i <= j) {
			char ch1 = s2.charAt(i);
			char ch2 = s2.charAt(j);
			if (ch1 != ch2) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}
}
