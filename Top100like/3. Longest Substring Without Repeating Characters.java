package Top100like;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    public int length(String s){
        int result = 0;
        int a_pointer = 0;
        int b_pointer = 0;

        Set<Character> set = new HashSet<>();
        while(b_pointer < s.length()){
            if(!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer));
               
              b_pointer++;
              result = Math.max(result, b_pointer - a_pointer);
            }else{
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return result;
    }
}
