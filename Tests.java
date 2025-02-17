//Tests.java
//Quatisha Poston

import java.util.Scanner;

public class Tests {
    private int numTests;  // Keeps track of how many scores were entered
    private double average;  // Stores the average of the scores

    // Constructor to set up initial values
    public Tests() {
        numTests = 0;
        average = 0.0;
    }

    public void getAverage() {
        Scanner input = new Scanner(System.in); // Scanner to read user input
        double sum = 0;
        int count = 0;

        System.out.println("Enter your test scores one at a time (type -1 to finish): ");
        double score = input.nextDouble(); // Get the first test score

        // Keep asking for scores until the user enters -1
        while (score != -1) {
            sum += score;  // Add the score to our total
            count++;  // Increase the number of scores we've collected

            System.out.println("Enter another score (or -1 to stop): ");
            score = input.nextDouble(); // Get the next score
        }

        // Only calculate the average if at least one score was entered
        if (count > 0) {
            average = sum / count; // Find the average
            numTests = count; // Save the number of scores entered
        } else {
            average = 0.0; // If no scores were entered, the average stays at 0
        }

        input.close(); // Always close the Scanner when you're done!
    }

    public String toString() {
        return "You entered " + numTests + " test scores.\n" +
                "Your average score is: " + String.format("%.2f", average); // Makes sure the average shows 2 decimal places
    }
}
