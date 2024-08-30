package StringsPackage;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static int longestPalinSubseq(String S) {
        StringBuilder R = new StringBuilder(S);
        R.reverse();

        // dp[i][j] will store the length of the longest
        // palindromic subsequence for the substring
        // starting at index i and ending at index j
        int[] curr = new int[R.length() + 1];
        int[] prev = new int[R.length() + 1];

        // Filling up DP table based on conditions discussed
        // in the above approach
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= R.length(); j++) {
                if (S.charAt(i - 1) == R.charAt(j - 1))
                    curr[j] = 1 + prev[j - 1];
                else
                    curr[j] = Math.max(curr[j - 1], prev[j]);
            }
            prev = Arrays.copyOf(curr, curr.length);
        }

        // At the end, DP table will contain the LPS
        // So just return the length of LPS
        return curr[R.length()];
    }

    // Driver code
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println("The length of the LPS is " + longestPalinSubseq(s));
    }
}
