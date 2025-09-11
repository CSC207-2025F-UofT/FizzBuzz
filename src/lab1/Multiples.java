package lab1;
public class Multiples {

    // Generalized method: count numbers < n divisible by a or b
    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // main stays one line (inlined variable)
        System.out.println(multiples(1000, 3, 5));
    }
}
