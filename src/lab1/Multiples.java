package lab1;
public class Multiples {

    // General version with parameters
    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }

    // Overloaded version: no parameters, defaults to (1000, 3, 5)
    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static void main(String[] args) {
        // Either call the default version...
        System.out.println(multiples());

        // ...or explicitly call the generalized one:
        // System.out.println(multiples(1000, 3, 5));
    }
}

