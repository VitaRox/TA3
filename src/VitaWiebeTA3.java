import java.util.*;
import static java.lang.Math.max;


/*
 *@author Vita Wiebe;
 *@version Assignment 3, Tuesday class, section H9;
 */
public class VitaWiebeTA3{

    // Create a public recursive method, which will call its overloaded private helper method;
    public static int getMax(int[] ourArray){

        /*
         Param 'max' is initialized to lowest possible int data type value;
         this guarantees that it won't ultimately return the initializing, "dummy"
         variable even if it isn't entered by the user;
        */
        return getMax(ourArray, 0, -1000000000);
     }

    // Create a private recursive helper method with 3 params:
    private static int getMax(int[] ourArray, int idx, int max) {


        // Base case:
        if (ourArray.length == 1) {
            return max;
            // Recursive case:
        }else if ((idx + 1) <= ourArray.length) {
            // Compare our current newMax and the value of array at index 'idx';
            int newMax = max(max, ourArray[idx]);
            // Increment index value 'idx' in recursive call;
            return getMax(ourArray, idx + 1, newMax);
        }
        // Other base case:
        return max;
    }

    /*
     Our application method;
     Obtain user input and call pertinent methods;
    */
    public static void main(String[] args) {

        // Create Scanner object to parse user input;
        Scanner scan = new Scanner(System.in);

        // Create counter to stop scanner from checking for input eternally;
        int count = 0;
        // Create an array to hold user input, 7 spaces
        int[] userIn = new int[7];
        int current;
        // Prompt end user for input of appropriate type;
        System.out.println("Please enter 7 integers, each separated by one space: ");

        do {
            // 'Try-catch' clause to catch bad user input and re-prompt for good input;
            try {
                // Assign each token (int) to a temp variable, "current";
                current = scan.nextInt();

                // Add the current value to our array for storage;
                userIn[count] = current;
                count++;
            } catch (InputMismatchException ime) {
                System.out.println("One of your values is either too big, too small, or" +
                        " otherwise not an integer. Please try again.");
            }
        } while (count < 7);

        //   A for-each loop to remind user of their input values, and in style ;)
        System.out.println("You entered: ");
        for (int value : userIn) {
            System.out.printf("%d  ==>  ", value);
        }
        // Return the largest integer found among the user's input;
        System.out.println("The largest element is " + getMax(userIn) + "!  That's a " +
                "relatively large amount.");
    }
}

