package lab1;

public class Reduce {

    // EXACT signature the tests expect
    public static int reduce(int n) {
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;   // even
            } else {
                n = n - 1;   // odd
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        // prints steps starting from 100
        System.out.println(reduce(100));
    }
}
