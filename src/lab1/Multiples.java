package lab1;

public class Multiples {

    // Task 1: main method modified to take parameters and return int result
    public static int main(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }

    // Task 2: overloaded main method with no parameters, calls main with default values
    public static int main() {
        return main(1000, 3, 5);
    }

    // Optional: original Java psvm method to enable running and printing the answer
    public static void main(String[] args) {
        System.out.println(main());  // prints result for default problem
    }
}
