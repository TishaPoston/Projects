import javax.swing.JOptionPane;

public class Runner3 {
    public static void main(String[] args) {
        String input;
        int questions = 0;
        int missed = 0;
        boolean validInput = false;

        // Get the number of questions on the exam
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                questions = Integer.parseInt(input);
                if (questions <= 0) {
                    throw new ArithmeticException("Number of questions must be greater than zero.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid whole number for the number of questions.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        validInput = false;

        // Get the number of questions the student missed
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                missed = Integer.parseInt(input);
                if (missed < 0 || missed > questions) {
                    throw new IllegalArgumentException("Missed questions must be between 0 and the total number of questions.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid whole number for missed questions.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        // Create an Exam object
        Exam exam = new Exam(questions, missed);

        // Use the new methods here
        String message = "Each question counts " + exam.getPointsEach() + " points.\n";
        message += "The exam score is " + exam.getScore() + ".\n";
        message += "The student missed " + exam.getMissedQuestions() + " questions.\n";
        message += "The total number of questions on the exam is " + exam.getTotalQuestions() + ".\n";
        message += "The exam grade is " + exam.getGrade();

        // Show the message
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
