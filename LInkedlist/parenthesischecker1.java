import java.util.*;
import java.io.*;
public class parenthesischecker1 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if((c==')' && top!='(') || (c==']' && top!='[') || (c=='}' && top!='{') ){
                    return false;
                }
            
        }
    }
    return stack.isEmpty();

    }
    public static void main(String[] args) {

        parenthesischecker1 obj = new parenthesischecker1();
        String str = "(){}[]";
        boolean result = obj.isValid(str);
        System.out.println(result);
    }
}

