package Solution;

public class Q10Solution {
    public static void main(String[] args) {

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
    public static void daysInMonth(){
        int[] day31 = {1,3,5,7,8,10,12};
        int[] day30 = {4,6,9,11};

    }

}
