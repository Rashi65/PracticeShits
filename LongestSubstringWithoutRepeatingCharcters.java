public class LongestSubstringWithoutRepeatingCharcters {

	public static int longSubstring(String s) {
		if (s.length() == 0)
			return 0;
		else if (s.length() == 1)
			return 1;
		else {
			int left = 0, right = 0, maxLength = 0;
			boolean visited[] = new boolean[256];
			while (right < s.length()) {
				if (visited[s.charAt(right)]) {
					while (visited[s.charAt(right)]) {
						visited[s.charAt(left)] = false;
						left++;
					}
				}
				visited[s.charAt(right)] = true;
				maxLength = Math.max(maxLength, right - left + 1);
				right++;
			}
			return maxLength;
		}
	}

	public static void main(String args[]) {
		String word = "rashiguptalivesinmumbai";
		int result = longSubstring(word);
		System.out.println("Longest substring without repeated characters: " + result);
	}
}