package chapter01;

/**
 * Introduction
 */
public class Main {

    {
        // This is a single line comment
        /*
         * This is a multiline comment.
         * Comments are written for the humans' benefit. The computer simply ignores them
         */

        // To store a text value, you do it like this:
        String name = "Sherlock Holmes";

        // To store a whole number (not a decimal), you do it like this:
        int age = 32;

        // A "boolean" value is either true or false
        boolean detective = true;
        boolean isDog = false;

        // You can print text, or the values of variables like this:
        System.out.println(name + " is " + age + " years old");

        // A single equals sign assigns the value on the right to the value on the left. (e.g. int a = 2;)
        // A double equals sign is used for comparing
        if (2 == 4) {
            System.out.println("2 is equal to 4?!!"); // This wouldn't show
        }

        /* You can use "if" to run different code. Only one of the statements will be run.
         * It'll be the first one that is "true", otherwise it'll be whatever's in the "else" section at the end (if there is one).*/
        if (age > 100) {
            System.out.println("Wow, you're really old");
        } else if (age > 50) {
            System.out.println("You're getting on a bit");
        } else {
            System.out.println("Plenty of life in you yet.");
        }

        // Two && symbols is used for testing two things. E.g.
        if (age < 50 && age > 18) {
            System.out.println("Not too old, not too young.");
        }

        // If you want to do something with a range of numbers, you can do it like this
        // The first part is the starting number, the second is when to keep going, and the third is the thing to change by
        for (int i = 4; i < 15; i = i + 3) {
            System.out.println("i is " + i);
        }

        // The percent symbol shows the remainder left over after a division. E.g.
        System.out.println("10/4 is " + (10 / 4) + " remainder " + 10 % 4);

        // You can put any of the code above into the "main" function below, and run it to try it out.
    }

    public static void main(String[] args) {
        /* Write a "Fizz/Buzz" program below here.
         * To try it, choose Run, Run, from the menu.*/


    }

}
