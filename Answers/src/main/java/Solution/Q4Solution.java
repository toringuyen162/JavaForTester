package Solution;

public class Q4Solution {
    //Sử dụng for loop để đảo 1 số nguyên cho trước
    public static void main(String[] args) {
        reverseFor(528546326);
    }

    public static void reverseFor(int n) {
        boolean isMinus = false;
        int reversedNum = 0;
        if (n < 0) {
            n = -n;
            isMinus = true;
        }
        if (n >= 0) {
            reversedNum = n % 10;
            for (int i = n / 10; i >= 1; i /= 10) {
                reversedNum = reversedNum * 10 + i % 10;
            }
        }
        if (isMinus==false) {
            System.out.println("So dao nguoc la: " + reversedNum);
        } else {
            System.out.println("So dao nguoc la: -" + reversedNum);
        }

    }

}
