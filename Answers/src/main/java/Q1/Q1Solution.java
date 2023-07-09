package Q1;

public class Q1Solution {
    public static void main(String[] args) {
    isPrimeNumber(11);
    }
    public static void isPrimeNumber (int i){

          if (i<=1) {
              throw new IllegalArgumentException("So nguyen to la so nguyen > 1");
          } else {
              int count = 1;
              for (int j=2;j<i;j++) {
                  if (i % j == 0) {
                      count++;
                  }
              }
              if (count == 1){
                  System.out.println(i+" la so nguyen to");
              } else {
                  System.out.println(i+" khong phai la so nguyen to");
              }

      }
    }
}
