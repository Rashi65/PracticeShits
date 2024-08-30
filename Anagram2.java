import java.util.HashMap;
import java.util.Set;

public class Anagram2 {

	public static void main(String args[]) {
		String str1 = "gram";
		String str2 = "agrm";
		if (isAnagram(str1, str2))
			System.out.println("Anagram");
		else {
			System.out.println("Not Anagram");
		}
	}

	private static boolean isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		if (str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			if (map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			} else {
				map.put(str1.charAt(i), 1);
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			if (map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
			} else {
				return false;
			}
		}
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			if (map.get(key) != 0) {
				return false;
			}
		}
		return true;

	}
}
