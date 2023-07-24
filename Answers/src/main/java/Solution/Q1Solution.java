package Solution;

public class Q1Solution {
    //Đề bài: tìm số nguyên tố
    public static void main(String[] args) {
        if (isPrimeNumber("3") == true) {
            System.out.println("Là số nguyên tố");
        } else System.out.println("Không phải là số nguyên tố");
    }

    public static boolean isPrimeNumber(String n) {
        int m;
        try {
            m = Integer.parseInt(n);
            if (m <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
