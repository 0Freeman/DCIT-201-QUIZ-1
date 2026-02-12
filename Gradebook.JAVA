
public class Gradebook {

    public static boolean validateScore(double score) {
        if (score < 0 || score > 100) {
            return false;
        } else {
            return true;
        }
    }

    public static char calculateLetterGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void displayPerformanceMessage(char grade) {
        if (grade == 'A') {
            System.out.println("Excellent work!");
        } else if (grade == 'B') {
            System.out.println("Good job!");
        } else if (grade == 'C') {
            System.out.println("Average performance.");
        } else if (grade == 'D') {
            System.out.println("You need to improve.");
        } else {
            System.out.println("You failed.");
        }
    }

    // --- The Manager Method (Question 1) ---
    public static void executeGradeReport(double score) {
        if (validateScore(score) == false) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);
        System.out.println("Grade: " + grade);
        displayPerformanceMessage(grade);
    }

    public static void main(String[] args) {
        System.out.println("--- Test 1: Score 85 ---");
        executeGradeReport(85);

        System.out.println("\n--- Test 2: Score 120 ---");
        executeGradeReport(120);

        System.out.println("\n--- Test 3: Score -5 ---");
        executeGradeReport(-5);
    }
}