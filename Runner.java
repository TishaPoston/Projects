import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);

        //This gets a valid user input for two numbers
        double n1 = getValidNumber(scan, "Please enter the first number: ");
        double n2 = getValidNumber(scan, "Please enter the second number: ");

        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        System.out.println(myCalculator);

        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //Calling Calc methods
        System.out.println("The sum is: " + myCalculator.add());
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }

    //This is how we make sure to get a number
    private static double getValidNumber(Scanner scan, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                scan.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next();
            }
        }
        return number;
    }
}
