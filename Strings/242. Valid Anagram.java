package Strings;

public class 242. Valid Anagram {
    public boolean isAnagram(String s, String t){
        if(s.length != t.length) return false;

        int[] c = new int[26];

        for(int i = 0; i< s.length; i++){
            c[s.charAt(i) - 'a']++;
            c[s.charAt(i) - 'a']--;
        }

        for(int i : c){
            if(i != 0){
               return false;
            }
        }

        return ture;
    }
    
}
