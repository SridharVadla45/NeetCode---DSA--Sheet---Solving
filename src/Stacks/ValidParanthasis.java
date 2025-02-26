package src.Stacks;

import java.security.KeyStore;
import java.util.Stack;

public class ValidParanthasis {
    public boolean isValid(String s) {
       if((s.length()&1)==1) return false;
       Stack<Character> stack = new Stack<Character>();
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(c=='{' || c=='[' || c=='(')stack.add(c);
           else{
               if(c == '}' && stack.peek()=='{')stack.pop();
               else return false;
               if(c == ']' && stack.peek()=='[')stack.pop();
               else return false;
               if(c == ')' && stack.peek()=='(')stack.pop();
               else return false;

           }
       }
       return true;
    }
}
