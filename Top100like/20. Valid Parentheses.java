package Top100like;

import java.util.Stack;

class ValidParentheses {
    public boolean isVaild(String s){
        if(s == null || s.length() == 0) return false;
        if(s.length() % 2 == 1) return false; 

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            }else if(!stack.isEmpty() && stack.peek() == '(' && c == ')'){
                stack.pop();
            }else if(!stack.isEmpty() && stack.peek() == '[' && c == ']'){
                stack.pop();
        }else if(!stack.isEmpty() && stack.peek() == '{' && c == '}'){
            stack.pop();
        }else{
            return false;
        }
    }
    return stack.isEmpty();
}
}