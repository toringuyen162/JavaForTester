package Q4;

public class Q4Solution {
    //Sử dụng for loop để đảo 1 số nguyên cho trước
    public static void main(String[] args) {
        reverseFor(528546326);
    }

    public static void reverseFor(int n) {
        boolean isMinus = false;
        int init=0;
        if (n < 0) {
            n = -n;
            isMinus = true;
        }
        if (n >= 0) {
             init = n % 10;
            for (int i = n / 10; i >= 1; i /= 10) {
                init = init * 10 + i % 10;
            }
        }
        if (isMinus) {
            System.out.println("So dao nguoc la: -" + init);
        } else {
            System.out.println("So dao nguoc la: " + init);
        }

    }

}
