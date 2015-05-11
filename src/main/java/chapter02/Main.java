package chapter02;

public class Main {

    {
        // If a number is too large to be stored in an int, you can use a "long";
        //int a = 12091820984; // This will error
        long b = 12091820984L; // You put an "L" on the end to show it's a long

        // This code will return the number of millseconds since 1970.
        long milliseconds = System.currentTimeMillis();

        /* A prime is divisible only by itself and 1.
         * Write some code to check if a number is a prime.
         * As an extra, display how long it takes to check this, and try and make it faster.
         * There are numerous optimisations */
    }

    public static void main(String[] args) {
        /* The code here calls another function (aka method) to do the prime number calculations.
         * isPrime takes a "long", and returns a "boolean" - true if it's a prime, and false if not. */

        System.out.println(2 + "         true  " + isPrime(2));
        System.out.println(5 + "         true  " + isPrime(5));
        System.out.println(81 + "        false " + isPrime(81));
        System.out.println(28714771 + "  true  " + isPrime(28714771));
        System.out.println(961748941 + " true  " + isPrime(961748941));
    }

    /**
     * Function/method to determine if a number is a prime.
     *
     * @param number the number to check
     * @return true if the number is a prime, false otherwise
     */
    public static boolean isPrime(long number) {
        // Put your code to work out a prime here.
        // It must return either true or false.


        return false;
    }

}
