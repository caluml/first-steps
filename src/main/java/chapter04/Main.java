package chapter04;

import java.util.Random;

/**
 * Exceptions
 */
public class Main {

    {
        /* So far, you've seen ideas and concepts that apply to most programming languages - mathematical operations,
         * if statements, for loops, etc.
         * Now we start to get slightly more Java-specific.
         */

        /* If something goes wrong in your program, it's nice to be able to prevent (if possible) the program from
         * stopping completely.
         * Java has the concepts of Exceptions. If something goes wrong in the program, an Exception can be "thrown".
         * These Exceptions can be "caught" and handled if possible. Here's an example.
         */
        String name = null;
        try {
            name.length();
            System.out.println("This will never be printed because the program will 'error' on the line before");
        } catch (Exception e) {
            System.err.println("An error occurred trying to get the length of a String that is null!");
        }

        /* The program above will always print the error message.
         * Sometimes, if an error occurs, you can do something about it. Sometimes, though, things will be out of your
         * control, and the best you can can do is simply print out what happened.
         */

        /* When you're writing a program, you can "throw" an exception. */

        int age = 7;
        if (age < 16) {
            throw new RuntimeException("You're too young - go away!");
        }

        /* So - one part of your program can throw Exceptions, and other parts of your program can "catch" them.
         * You can produce random numbers like this:
         */
        Random random = new Random(); // You only need to do this once.
        System.out.println("Here's a random number: " + random.nextInt(10));

        // Try and do this below
    }


    public static void main(String[] args) {
        // Modify this function so that the happy message is printed if all numbers are above 0, and the sad message
        // is printed if a number is 0
        Random random = new Random();

        pickNumbers(40, random);
        System.out.println(":) All the numbers were above 0!");

        System.err.println(":( A number was 0");
    }

    /**
     * Function that picks random numbers
     *
     * @param numberToPick          the number of random numbers to pick
     * @param randomNumberGenerator a Random to use for picking numbers
     */
    private static void pickNumbers(int numberToPick, Random randomNumberGenerator) {
        /* Write code here that picks "numberToPick" random "int"s between 0 and 10, and throws an exception
         * if any of them are 0 */

    }
}
