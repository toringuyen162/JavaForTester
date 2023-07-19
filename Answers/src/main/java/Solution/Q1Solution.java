package Solution;

public class Q1Solution {
    //Đề bài: tìm số nguyên tố
    public static void main(String[] args) {
        isPrimeNumber((float) -19);
    }

    public static void isPrimeNumber(float n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n Phải là số nguyên dương lớn hơn 1");
        }
        int count = 0;
        if (n == Float.valueOf(n).intValue()) {
            count = 1;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
