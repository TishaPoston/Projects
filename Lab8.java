import java.io.*;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            reader.readLine();

            while ((reader.ready())) {
                String line = reader.readLine();
                String[] parts = line.split(",");

                int empnumber = Integer.parseInt(parts[0]);
                double payRate = Double.parseDouble(parts[1]);
                double hours = Double.parseDouble(parts[2]);

                double regularHours = 0;
                double overtimeHours = 0;

                if (hours > 40) {
                    regularHours = 40;
                    overtimeHours = hours - 40;
                } else {
                    regularHours = hours;
                    overtimeHours = 0;
                }

                double weeklyPay = regularHours * payRate;
                double overtimePay = overtimeHours * payRate * 1.5;
                double totalPay = weeklyPay + overtimePay;

                String formattedPay = "$" + String.format("%.2f", totalPay);

                String outputLine = empnumber + "," + payRate + "," + hours + "," + formattedPay;
                writer.write(outputLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("🎉 Payroll complete! Go check your results!");

        } catch (Exception e) {
            System.out.println("Something went wrong.");
            System.out.println(e.getMessage());
        }
    }
}
