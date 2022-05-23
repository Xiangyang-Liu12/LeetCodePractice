package Strings;

public class LongestPalindromicSubstring {

    private int lo;
    private int maxLen;

    public String longestPalindrome(String s){
       int len = s.length();
       if(len < 2){
           return s;
       }
      for(int i = 0; i < len - 1; i++){
          extendPalindrome(s, i, i);
          extendPalindrome(s, i, i+ 1);
      }
      return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int start, int end) {
      while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
          start--;
          end++;
      }
      if(maxLen < end - start - 1){
          lo = start + 1;
          maxLen = end - start -1;
      }
    }
    
}
