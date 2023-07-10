package Solution;

public class Q5Solution {
    public static void main(String[] args) {
    reverseWhile(-123123123);
    }


    public static void reverseWhile(int n) {
        boolean isMinus = false;
        int reversedNum = 0;
        if (n < 0) {
            n = -n;
            isMinus = true;
        }
        if (n >= 0) {
            while (n != 0) {
                reversedNum = reversedNum * 10 + n % 10;
                n = n / 10;
            }
        }
        if (isMinus == true) {
            System.out.println("So dao nguoc la: -" + reversedNum);
        } else {
            System.out.println("So dao nguoc la: " + reversedNum);
        }
    }
}
