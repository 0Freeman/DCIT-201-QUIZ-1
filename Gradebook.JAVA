public class Gradebook {

    public static boolean validateScore(double score) {
        if (score < 0 || score > 100) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(validateScore(85));
        System.out.println(validateScore(-10));
        System.out.println(validateScore(105));
    }
}