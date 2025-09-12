package lab1;

public class Reduce {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using a loop to sum the elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
