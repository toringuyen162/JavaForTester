package Q2;

import java.util.Arrays;

public class Q2Solution {
    public static void main(String[] args) {
        sortArray();
    }
    //không sử dụng sort()
    public static void sortArray(){
        Integer[] a = {1,3,32,4,734,3,-1,-234,0};
        int smallerNumber=0;
        for (int i=0;i<a.length-1;i++){
            if (a[i]>=a[i+1]){
                smallerNumber=a[i+1];
                a[i+1]=a[i];
                a[i]=smallerNumber;
            }

        }
        System.out.println(Arrays.toString(a));

    }
}
