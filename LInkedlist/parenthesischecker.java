import java.util.*;
import java.io.*;

public class parenthesischecker {

    public static boolean isValid(String s) {
        int opencount = 0;
        int n = s.length();
        if (n % 2 != 0)
            return false;

            for(char c:s.toCharArray()){
                if(c=='('|| c == '{'|| c == '['){
                    opencount++;
                }else{
                    if(opencount == 0){
                        return false;
                    }
                    opencount--;
                }
            }
            return opencount == 0;
    }

    public static void main(String[] args) {
        String str = "({}[]";
       boolean result = isValid(str);
       System.out.println(result);

      
    }
}
