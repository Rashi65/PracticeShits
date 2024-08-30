package StringsPackage;

public class ReverseWordsOfString {
////Complexity --- time: o(n) and space: o(n)
//	public static String reverseWord(String s) {
//		String words[] = s.split(" ");
//		String words2[] = new String[words.length];
//		int j = 0;
//		for (int i = words.length - 1; i >= 0; i--) {
//			words2[j] = words[i];
//			j++;
//		}
//		String z = "";
//		for (int x = 0; x < words2.length; x++) {
//			z += words2[x] + " ";
//		}
//		z = z.trim();
//		return z;
//	}

	public static void main(String args[]) {
		String result = reverseWord("my name is rashi");
		System.out.println(result);
	}
	
	
////Complexity -- time: o(n),space: o(1)
	public static String reverseWord(String s) {
	    // Split the input string into words
	    String[] words = s.split(" ");
	    
	    // Use StringBuilder for efficient string concatenation
	    StringBuilder reversed = new StringBuilder();
	    
	    // Traverse the words array in reverse order
	    for (int i = words.length - 1; i >= 0; i--) {
	        // Append each word to StringBuilder with a space
	        reversed.append(words[i]).append(" ");
	    }
	    
	    // Convert StringBuilder to String and trim trailing spaces
	    return reversed.toString().trim();
	}

}
