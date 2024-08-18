import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class bestdivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int n1 = Integer.parseInt(bufferedReader.readLine().trim());
        
         int sumofdigitsn = sumOfDigits(n);
        int sumofdigitsn1 = sumOfDigits(n1);
        
        
        if (sumofdigitsn > sumofdigitsn1) {
            System.out.println(n);
        } else if (sumofdigitsn < sumofdigitsn1) {
            System.out.println(n1);
        } else {
            if (n < n1) {
                System.out.println(n);
            } else {
                System.out.println(n1);
            }
        

        bufferedReader.close();
    }
     static int sumofdigit(int num){
            int sum = 0;
             while(num !=0){
             sum+=num%10;
            num = num/10;
             }
            return sum;
          }
}
