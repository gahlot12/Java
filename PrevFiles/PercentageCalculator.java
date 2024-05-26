import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] marksInSub = new int[5];
        int totalMarksGet = 0;

        // Read marks for each subject
        for (int i = 0; i < 5; i++) {
            int marks = s.nextInt();
            if (marks >= 0 && marks <= 100) {
                marksInSub[i] = marks;
                totalMarksGet += marksInSub[i];
            } else {
                System.out.println("Marks should be between 0 and 100.");
                i--;
            }
        }

        // Calculate percentage
        double percentage = (totalMarksGet / 500.0) * 100; // Convert to double for accurate division
        System.out.println("Total Percentage of the Student: " + percentage + "%");

        s.close(); // Close the scanner
    }
}
