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

    public static void main(String[] args) {
        System.out.println(calculateLetterGrade(95));
        System.out.println(calculateLetterGrade(85));
        System.out.println(calculateLetterGrade(75));
        System.out.println(calculateLetterGrade(65));
        System.out.println(calculateLetterGrade(55));
    }
}