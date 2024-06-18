public class fibo1 {
    public static void main(String[] args) {
        int result = fibo(5);
        System.out.println(result);

    }

    public static int fibo(int n) {
        if (n < 2) {
            return 0;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
