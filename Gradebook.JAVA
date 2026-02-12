public class Gradebook {

    // --- HELPER METHODS FOR QUESTION 1 ---
    public static boolean validateScore(double score) {
        if (score < 0 || score > 100) {
            return false;
        }
        return true;
    }

    public static char calculateLetterGrade(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    public static void displayPerformanceMessage(char grade) {
        if (grade == 'A') System.out.println("Excellent work!");
        else if (grade == 'B') System.out.println("Good job!");
        else if (grade == 'C') System.out.println("Average performance.");
        else if (grade == 'D') System.out.println("You need to improve.");
        else System.out.println("You failed.");
    }

    // --- QUESTION 1: EXECUTE GRADE REPORT ---
    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }
        char grade = calculateLetterGrade(score);
        System.out.println("Score: " + score + " -> Grade: " + grade);
        displayPerformanceMessage(grade);
    }

    // --- QUESTION 2: CALCULATE CLASS AVERAGE (Overloading) ---

    // Version 1: Takes two scores
    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    // Version 2: Takes three scores
    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    // Version 3: Takes an array (list) of scores
    public static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum / scores.length;
    }

    // --- MAIN METHOD TO TEST EVERYTHING ---
    public static void main(String[] args) {
        System.out.println("=== TEST QUESTION 1 ===");
        executeGradeReport(85);
        executeGradeReport(120);

        System.out.println("\n=== TEST QUESTION 2 ===");
        // Test Version 1 (Two scores)
        System.out.println("Average of 80 and 90 is: " + calculateClassAverage(80, 90));

        // Test Version 2 (Three scores)
        System.out.println("Average of 70, 80, 90 is: " + calculateClassAverage(70, 80, 90));

        // Test Version 3 (Array of scores)
        double[] myScores = {50, 60, 70, 80, 90};
        System.out.println("Average of array is: " + calculateClassAverage(myScores));
    }
}