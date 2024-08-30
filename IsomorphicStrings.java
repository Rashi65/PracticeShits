package StringsPackage;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static boolean Isomorphic(String a, String b) {
		if (a.length() != b.length())
			return false;
		Map<Character, Character> charMap = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			if (!charMap.containsKey(a.charAt(i))) {
				if (!charMap.containsValue(b.charAt(i))) 
					charMap.put(a.charAt(i), b.charAt(i));
				else {
					return false;
				}
			} else {
				char ch = charMap.get(a.charAt(i));
				if (!(ch == b.charAt(i)))
					return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		boolean result = Isomorphic("paper", "title");
		System.out.println(result);
	}
}
