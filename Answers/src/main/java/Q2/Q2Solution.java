package Q2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2Solution {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
    }

    //không sử dụng sort()
    public static void sortArray() {
        Integer[] a = {1, 3, 32, 4, 734, 3, -1, -234, 0};
        int smallerNumber = a[1];
        for(int j=0;j<a.length;j++) {
            for (int i = 0; i < a.length - 1; i++) {
                while (a[i] >= a[i + 1]) {
                    smallerNumber = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = smallerNumber;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void sortArray2(){
        Integer[] b = {1, 3, 32, 4, 734, 3, -1, -234, 0};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(b));
        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        for (int i=0;i< arrayList.size();i++);
            finalArray.add(arrayList.in)

    }
}
