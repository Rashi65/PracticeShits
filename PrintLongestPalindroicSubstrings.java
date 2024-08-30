package StringsPackage;

public class PrintLongestPalindroicSubstrings {

    public static int findLongestPalindromeLength(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            maxLength = Math.max(maxLength, expandAroundCenter(s, i, i));       // Odd-length palindromes
            maxLength = Math.max(maxLength, expandAroundCenter(s, i, i + 1));   // Even-length palindromes
        }
        return maxLength;
    }

    public static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Length of the palindrome
    }

    public static void main(String[] args) {
        String s = "GOOGLE";
        int result = findLongestPalindromeLength(s);
        System.out.println("Length of the longest palindromic substring: " + result);
    }
}
