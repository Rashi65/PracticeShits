package StringsPackage;

public class ValidPalindrome {

	//////////////complexity === On On
	public static boolean validPalindrome(String s) {
		s = s.toLowerCase();
		String g = "", z1 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				g += ch;
			}
		}
		StringBuilder z = new StringBuilder(g);
		z = z.reverse();
		z1 = z.toString();
		if (g.equals(z1))
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		boolean result=validPalindrome("A man, a plan, a canal: Panama");
		System.out.println(result);
	}
	
	
	/////////////////complexity === On, O1
	
//	public static boolean validPalindrome(String s) {
//        StringBuilder filteredString = new StringBuilder();
//
//        // Filter out non-letter characters and convert to lowercase
//        for (int i = 0; i < s.length(); i++) {
//            char ch = Character.toLowerCase(s.charAt(i));
//            if (Character.isLetter(ch)) {
//                filteredString.append(ch);
//            }
//        }
//
//        // Check if the filtered string is a palindrome
//        int left = 0, right = filteredString.length() - 1;
//        while (left < right) {
//            if (filteredString.charAt(left) != filteredString.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) {
//        boolean result = validPalindrome("A man, a plan, a canal: Panama");
//        System.out.println(result);  // Should print true
//    }
}
