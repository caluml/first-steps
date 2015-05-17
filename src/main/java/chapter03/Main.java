package chapter03;

/**
 * Arrays
 */
public class Main {

    {
        /* So far, you've looked at single values being stored. e.g: */
        int age = 34; // or
        String name = "Sherlock";
        /* Often it's useful to store multiple values.
         * For this, you can use an "array".
         * If you had 2 cats (called Fluffy and Smelly), you could store them like this: */
        String[] catNames = new String[2];
        // You can store values in the "slots" of the array.
        catNames[0] = "Fluffy"; // This goes in the first slot. Note it goes from 0 to 4, and not 1 to 5.
        catNames[1] = "Smelly"; // This will produce an error.

        /* Arrays can store any type.
         * For instance, this would make an array of 5 "int"s */
        int[] numbers = new int[5];
        numbers[0] = 124;
        numbers[5] = 813;

        /* Arrays are simple and fast, but they have a problem: you can't resize them. If you need to "make it bigger",
         * you need to create a larger second array, and copy the value from the first into it. */
    }

    public static void main(String[] args) {
        // Create a smallish array of ints here, and fill it with values.

        /* Now imagine that you've made it too small. Create a second, large array, and copy the values from the first
         * into the second. */
    }



    /* As an extra aside, what values are in a newly created array if you don't put any values there? */
}
