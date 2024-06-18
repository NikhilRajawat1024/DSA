import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int sum = calculateMultiples(N);
            System.out.println(sum);
        }
    }

    private static int calculateMultiples(int N) {
        int multipleofthree = N%3;
        N/10 = 
        int multipleoffive = N%5;
        
        // int fifteenths = N / 15 * 15;

        return threes + fives ;
    }
}
