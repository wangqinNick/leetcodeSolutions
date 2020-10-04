package notes;

public class Fib {
    // 0, 1, 1, 2, 3, 5, 8 ...
    private static int fib1(int n){
        if(n <= 1) return n;
        return fib1(n-2) + fib1(n-1);
    }

    private static int fib2(int n){
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib1(3));
        System.out.println(fib2(3));
    }
}
