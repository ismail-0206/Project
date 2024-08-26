import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input average score
        System.out.print("Enter the average score: ");
        int average = scanner.nextInt();

        // Determine the grade using switch
        String grade;
        switch (average / 10) {
            case 10: // For scores of 100
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        // Output the result
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
