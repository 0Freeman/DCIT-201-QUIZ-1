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

    public static void main(String[] args) {
        displayPerformanceMessage('A');
        displayPerformanceMessage('B');
        displayPerformanceMessage('C');
        displayPerformanceMessage('D');
        displayPerformanceMessage('F');
    }
}