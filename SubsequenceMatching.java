package StringsPackage;

public class SubsequenceMatching {
    public static boolean isSubsequence(String mainStr, String subStr) {
        int m = mainStr.length();
        int n = subStr.length();
        int j = 0;  // Pointer for subStr
        
        for (int i = 0; i < m; i++) {
            if (j < n && mainStr.charAt(i) == subStr.charAt(j)) {
                j++;
            }
            if (j == n) {
                return true;
            }
        }
        
        return j == n;
    }

    public static void main(String[] args) {
        String mainString = "abcde";
        String subSequence = "ace";
        System.out.println(isSubsequence(mainString, subSequence));  // Output: true

        mainString = "abcde";
        subSequence = "aec";
        System.out.println(isSubsequence(mainString, subSequence));  // Output: false
    }
}
