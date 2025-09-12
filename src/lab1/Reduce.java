package lab1;

public class Reduce {
    public static int reduce(int n){
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(200);
        System.out.println(42);
    }
}
