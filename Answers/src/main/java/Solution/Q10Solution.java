package Solution;

public class Q10Solution {
    public static void main(String[] args) {
        daysInMonth("05/2024");
    }


    public static void daysInMonth(String input) {
        int m = Integer.parseInt(input.substring(0, 2));
        int y = Integer.parseInt(input.substring(3));
        int[] day30 = {4, 6, 9, 11};

        if (m == 2) {
            if (Q13SolutionLeapYear.isLeapYear(y) == false) {
                System.out.println(input + " co 28 ngay");
            } else System.out.println(input + " co 29 ngay");
        } else {
            boolean have30Days = false;
            for (int i : day30) {
                if (m==i) {
                    have30Days = true;
                    break;
                }
            }
            if (have30Days == true) {
                System.out.println(input + " co 30 ngay");
            } else System.out.println(input + " co 31 ngay");
        }
    }
}


