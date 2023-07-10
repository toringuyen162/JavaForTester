package Q2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2Solution {
    public static void main(String[] args) {
        sortArray2();
        EscSort();
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

    public static void sortArray2() {
        Integer[] b = {1, 3, 32, 4, 734, 3, -1, -234, 0};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(b));
        ArrayList<Integer> outPut = new ArrayList<Integer>();
        int minIndex;
        while (!arrayList.isEmpty()) {
            int min = arrayList.get(0);
            minIndex = 0;
            for (int i = 1; i < arrayList.size(); i++) {
                if (min > arrayList.get(i)) {
                    min = arrayList.get(i);
                    minIndex = i;
                }
            }
            outPut.add(min);
            arrayList.remove(minIndex);
        }
        System.out.println("Sorted Array: "+ outPut);
    }

//Bài giải của thầy
    public static void EscSort() {
        Integer[] a = {1, 3, 32, 4, 734, 3, -1, -234, 0};
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] >= a[j + 1]) {
                        int temp = 0;
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.print("Array after EscSort: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Null array.");
        }
    }
}
