package Solution;

public class Q13SolutionLeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(3032));
    }

    public static boolean isLeapYear(int y) {
        if (y <= 0) {
            throw new IllegalArgumentException("Nam phai la so duong");
        }
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

