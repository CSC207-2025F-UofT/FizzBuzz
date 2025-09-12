package lab1;

public class Multiples {

    public static void main(String[] args) {

        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        if (a == b) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (i % a == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

