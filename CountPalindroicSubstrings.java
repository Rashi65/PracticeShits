package StringsPackage;

import java.util.HashSet;

public class CountPalindroicSubstrings {

	public static int countSubstrings(String s) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            isPalindrome(s,i,i,set); //odd palindromes
            isPalindrome(s,i,i+1,set); //even palindromes
        }
        return set.size();
     }

     public static void isPalindrome(String str, int left, int right, 
     HashSet<String> set){
        while((left>=0 && right<str.length()) && (str.charAt(left) == str.charAt(right))){
            set.add(str.substring(left,right+1));
            left--;
            right++;
        }
     }
     
     public static void main(String args[]) {
    	 String s="GOOGLE";
    	 int result=countSubstrings(s);
    	 System.out.println(result);
     }
}
