package Top100like;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationsofaPhoneNumber {
    public List<String> LetterCombinations(String digits){
       List<String> result = new ArrayList<>();
       if(digits == null || digits.length() == 0){
           return result;
       } 
       String[] map =  { "0",
       "1",
       "abc",
       "def",
       "ghi",
       "jkl",
       "mno",
       "pqrs",
       "tuv",
       "wxyz"};
       helper(result, digits, "", 0, map);
       return result;
    }
    public void helper(List<String> result, String digits, String current, int index, String[] map){
        if(index == digits.length()){
            result.add(current);
            return;
        }
        String letter = map[digits.charAt(index) - '0'];
        for(int i = 0; i < letter.length(); i++){
           helper(result, digits, current + letter.charAt(i), index+1, map);
        }
    }
}
