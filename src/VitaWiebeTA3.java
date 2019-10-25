import java.util.*;
import java.math.*;

/*
 *@author Vita Wiebe;
 *@version Assignment 3, Tuesday class, section H9;
 */
public class VitaWiebeTA3 {

    // Create a public recursive method, which will call its overloaded private helper method;
    public static int getMax(int[] ourArray){
        return getMax(ourArray, 0, 0);
     }

    // Create a private recursive helper method with 2 params:
    private static int getMax(int[] ourArray, int idx, int max){

        // Compare our current testValue and the value of array at index 'idx';
        int newMax = Math.max(max, ourArray[idx]);

        // Recursive case:
        if((idx + 1) < ourArray.length){
            // Increment index value 'idx';
            getMax(ourArray, idx + 1, newMax);
        // Base case:
        }else if(ourArray.length == 1){
            return max;
        }
//      // Other base case:
        return max;
    }

    /*
     Our application method;
     Obtains user input and calls pertinent methods;
    */
    public static void main(String[] args) {

        // Create Scanner object to parse user input;
        Scanner scan = new Scanner(System.in);

        // Create counter to stop scanner from checking for input eternally;
        int count = 0;

        // Create an array to hold user input, 7 spaces
        int[] userIn = new int[7];

        // Prompt end user for input of appropriate type;
        System.out.println("Please enter 7 integers, each separated by one space: ");
        while (count < 7){

            // Assign each token (int) to a temp variable, "current";
            int current = scan.nextInt();

            // Add the current value to our array for storage;
            userIn[count] = current;
            count++;
        }
        // A for-each loop to test that user input is being taken and stored correctly;
        for (int value : userIn) {
            System.out.println(value);
        }
        System.out.println("the max is " + getMax(userIn));
    }



}
