package Solution;

public class Q1Solution {
    //Đề bài: tìm số nguyên tố
    public static void main(String[] args) {
        isPrimeNumber(11.5);
    }

    public static void isPrimeNumber(int n) throws (Exception e) {
        try {
            int count = 1;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }

        } catch (Exception e) {
            System.out.println("So nguyen to la so nguyen > 1");
        }
    }
}
