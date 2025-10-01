package lab1;

public class Reduce {
    public static int reduce(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        int count = 0;
        for (int d = 1; d * d <= n; d++) {
            if (n % d == 0) {
                if(d * d == n ){
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(200);
        System.out.println(90);
        System.out.println(42);
    }
}
