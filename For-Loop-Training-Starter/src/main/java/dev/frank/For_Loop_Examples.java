package dev.frank;


public class For_Loop_Examples {
    public static void main(String[] args) {

/*******************************************************************************************************************
 * for-loops in Java Starter Code
 ******************************************************************************************************************/

        System.out.println("-".repeat(100) + "\nWelcome to Frank's for-loop Examples\n" + "-".repeat(100));

        int[] testScores = {100, 80, 90};

        System.out.println("Array testScores contains " + 3 + " elements: "
                          + testScores[0] + ", "
                          + testScores[1] + ", "
                          + testScores[2]);

        int sum = testScores[0] + testScores[1] + testScores[2];
        System.out.println("Sum of elements in array testScores: " + sum);
        System.out.println("Average of elements in array testScores: " + sum / 3);
    }
}