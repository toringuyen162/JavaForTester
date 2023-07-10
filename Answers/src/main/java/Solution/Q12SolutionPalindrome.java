package Solution;

public class Q12SolutionPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("12312312323"));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != (str.charAt(len - i - 1))) {
                return false;
            }
        }
        return true;
    }
}

