public class TestRunner {

    public static void main(String[] args) {
        // Create a Tests object so we can use its methods
        Tests myTests = new Tests();

        // Call the method to let the user enter scores
        myTests.getAverage();

        // Show the results (how many scores were entered and the average)
        System.out.println(myTests.toString());
    }
}
