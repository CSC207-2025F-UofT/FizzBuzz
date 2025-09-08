package lab1;
//hhhh666
//hhhh777
/// 888
//999
/**
 * Solve the lab1.FizzBuzz challenge.
 */
/// 1010101
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            doFizzBuzz(i);
        }
    }
//hhhh
    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}

//class FizzBuzz {
//
//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 100) {
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//            i++;
//        }
//        }
//    }
