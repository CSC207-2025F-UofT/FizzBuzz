package lab1;

public class Reduce {
    public static int reduce(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        int count = 0;
        for (int d = 1; d * d <= n; d++) {
            if (n % d == 0) {
                int q = n / d;
                if (d != 1 && d != n) count++;
                if (q != 1 && q != n && q != d) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(200);
        System.out.println(42);
    }
}
