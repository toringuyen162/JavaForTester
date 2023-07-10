package Solution;

import java.util.Arrays;

public class Q10Solution {
    public static void main(String[] args) {
    daysInMonth("02/2024");
    }

    public static boolean isLeapYear(int y){
        if(y<=0){
            throw new IllegalArgumentException("Nam phai la so duong");
        }
        if((y%4==0 && y%100!= 0)||(y%400==0)){
            return true;
        } else {
            return false;
        }
    }
    public static void daysInMonth(String input){
        int m = Integer.parseInt(input.substring(0,2));
        int y=Integer.parseInt(input.substring(3));
        int[] day30 = {4,6,9,11};
        if (m==2) {
            if (isLeapYear(y) == false) {
                System.out.println(input +" co 28 ngay");
            } else System.out.println(input+" co 29 ngay");
        } else {
            for (int i:day30){
                if (m==i){
                    System.out.println(input+" co 30 ngay");
                }
                else System.out.println(input+ "co 31 ngay");
            }
        }
    }
}
