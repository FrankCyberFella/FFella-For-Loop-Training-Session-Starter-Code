package com.frank;

/************************************************************************************************************
 *  Note to Teaching Demo Participants:
 *  
 *  Normally the starter code * would have much less code in it.
 *
 *  The students would code-along during the presentation to
 *      the various examples.
 *
 *  Many of the comments you see would be done during the code-along.
 *
 *  Due to the condensed time of the Teaching Demo, I included
 *      some code and comments to illustrate what students will get during the session.
 *
 *  We will be adding code during the teaching demo.
 *
 *  I will be discussing the comments and adding code during the demo.
 ************************************************************************************************************/

import java.util.Scanner;  // used in the commented out code in the last example

public class For_Loop_Examples {
    public static void main(String[] args) {

//*****************************************************************************************************************
//
//  for loop - Used when you need to iterate or count through a series of values
// 	           It is possible to NOT execute the loop body even once if the loop
//                            condition is true at the start of the loop
//
//             syntax: for (initialization; loop-condition; increment) {
//                         loop body - what you want to do each time through the loop
//                     }
//
//              How for loop works:
//
// 	                1. Perform the initialization process - this usually sets the loop
// 	                                                        variable to its initial value.
//
// 	                2. Test the loop-condition - if true, go to step #3
// 	                                             if false, end the loop
//
// 	                3. Execute the code in the loop body.
//
// 	                4. Perform the increment process
//
// 	                5. Go to step #2
//
// 	              Example:
//
// 	                 for (int i=0; i < 5; i++) {  // Loop while i is less than 5 (i=0,1,2,3,4)
// 	 		               // some processing for the loop
//                   }
//
//
//  Hints for using a for-loop:
//
//     1. When processing all elements in an array from first element to last:
//
//        a. set the loop-variable to 0
//        b. the loop-condition is coded as: loop-variable < arrayName.length
//        c. the increment is coded: loopVariable++
//        d. in the body: process-an-element-using-loop-variable-as-index arrayName[loop-variable]
//
//        Think of the loop variable as a way to access the current element in the array
//
//        for (int i=0; i < arrayName.length; i++) {
//            // arrayName[i] - fetch the current element from the array
//        }
//
//
//     2. When processing a consecutive subset elements in an array:
//
//        a. set the loop-variable to the index-of-the-first-element to process
//        b. the loop-condition is coded as: loop-variable <= index-of-last-element-process
//           Note: condition is <=
//        c. the increment is coded: loopVariable++
//        d. in the body: process-an-element-using-loop-variable-as-index arrayName[loop-variable]
//
//        Think of the loop variable as a way to access the current element in the array
//
//        for (int i=0; i < arrayName.length; i++) {
//            // arrayName[i] - fetch the current element from the array
//        }
//
//
//     3. When processing every-n subset elements in an array:
//
//        a. Set the loop-variable to the index-of-the-first-element to process
//        b. The loop-condition is coded as: loop-variable <= arrayName.length
//        c. The increment is coded: loopVariable += n
//        d. In the body: process-an-element-using-loop-variable-as-index arrayName[loop-variable]
//
//        Think of the loop variable as a way to access the current element in the array
//
//        Process every other element in an array starting at element 0
//        for (int i=0; i < arrayName.length; i += 2) {
//            // arrayName[i] - fetch the current element from the array
//        }
//
//        Process every 4th element in an array starting at first element
//        for (int i=0; i < arrayName.length; i += 4) {
//            // arrayName[i] - fetch the current element from the array
//        }
//
//        Process every other element in an array starting at 3rd element
//        for (int i=3; i < arrayName.length; i += 2) {
//            // arrayName[i] - fetch the current element from the array
//        }
//
//
//     4. Count the number of times the loop was executed:
//
//        Note: a for-loop may not be the best Java loop option for this case
//              it is provides as an academic example to show its use
//
//        a. Define a loop-variable BEFORE the for loop and set it to 0: int loopVariable = 0;
//        b. Omit the initialization part of the for-loop: for(;loop-condition; increment)
//        c. Code the loop-condition for when you want the loop to end
//        d. The increment is coded: loopVariable++
//        e. In the body: perform-some-process which eventually causes the loop condition to be true
//
//        At then end of the loop, the loop variable will be the number of times loop was done
//
//        See example in the code below
// ******************************************************************************************************************/

        System.out.println("-".repeat(100) + "\nWelcome to Frank's for-loop Examples\n" + "-".repeat(100));

        int[] charles = {10, 20, 30};

        // Processing elements in array without a for-loop
        System.out.println("Array charles contains " + 3 + " elements: "
                           + charles[0] +", "
                           + charles[1] +", "
                           + charles[2]);

        int sum = charles[0] + charles[1] + charles[2];
        System.out.println("Sum of elements in array charles: " + sum);
        System.out.println("Average of elements in array charles: " + sum / 3);






//****************************************************************************************
// Example showing how a for-loop may be used to count the number of time a loop was done
//****************************************************************************************

//// Loop until the user enters a 0
//        Scanner theKeyboard = new Scanner(System.in); // Define an object to represent the keyboard
//        int numberOfLoops = 0;                        // Count number of times loo was performed
//        int userInput     = -1;                       // Set loop control variable make it loop
//        for(;userInput != 0; numberOfLoops++) {       // Loop until the user enters a 0
//           System.out.println("Please enter a number or 0 to end..."); // Prompt user for a number
//           String aLine = theKeyboard.nextLine();                      // Get user input as a String
//           userInput = Integer.parseInt(aLine);                        // Convert String input to an int
//           if(userInput != 0) {                                        // If something other than 0 entered...
//              System.out.println("You entered: " + userInput);         //    process the number
//           }
//        }
//        // At end of loop, the loop variable contains number of times loop was done
//        //     adjust loop variable to reflect all values entered except the one that ended the loop
//        System.out.println("You entered " + (numberOfLoops - 1) + " numbers");

        System.out.println("-".repeat(100) + "\nEnd of Frank's for-loop Examples\n" + "-".repeat(100));
    }
}