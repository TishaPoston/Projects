public class Calc {

    private double num1;
    private double num2;

    public Calc() {
    }

    public void setNum1(double number) {
        num1 = number;
    }

    public void setNum2(double number) {
        num2 = number;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public String toString() {
        return "Displaying private data fields using toString():\nNum1: " + num1 + "\nNum2: " + num2;
    }
}
