package chapter03;

public class Main {

    {
        /* So far, you've looked at single values being stored. e.g.
         * int age = 34, or String name = "Sherlock";
         * Often it's useful to store multiple values.
         * For this, you can use an "array". Arrays can store any type.
         * For instance, this would make an array of "int"s of size 5.
         */
        int[] numbers = new int[5];

        // You can store values in the "slots" of the array.
        numbers[0] = 124; // This goes in the first slot. Note it goes from 0 to 4, and not 1 to 5.
        numbers[5] = 813; // This will produce an error.

        /* You can't resize arrays though. If you need to "make it bigger", you need to create a second array,
         * and copy the value from the first into it. */
    }

    public static void main(String[] args) {
        // Create a smallish array of ints here, and store some values in it.

        /* Now imagine that you've made it too small. Create a second, large array, and copy the values from the first
         * into the second. */
    }
}
