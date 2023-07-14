package Solution;

import java.lang.management.MemoryManagerMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q15Diem {
    private int x;
    private int y;

    public Q15Diem() {

    }

    public Q15Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if (x < -2000 || x > 2000) {
            System.out.println("Nhập x trong khoảng từ -2000 tới 2000: ");
            return;
        } else this.x = x;
    }


    public void setY(int y) {
        if (y < -2000 || y > 2000) {
            System.out.println("Nhập y trong khoảng từ -2000 tới 2000: ");
            return;
        } else this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static float length(Q15Diem a, Q15Diem b) {
        return (float) Math.sqrt((Math.pow((b.getX() - a.getX()), 2) + Math.pow(b.getY() - a.getY(), 2)));
    }

    public float comp(float a, float b) {
        if (a > b) {
            return a;
        } else return b;
    }

    public static void main(String[] args) {
        Q15Diem a = new Q15Diem(0, 1);
        Q15Diem b = new Q15Diem(0, 2);
        Q15Diem c = new Q15Diem(0, 3);
        var ab = length(a, b);
        var bc = length(b, c);
        var ac = length(a, c);
        ArrayList<Float> list = new ArrayList<Float>();
        list.add(ab);
        list.add(bc);
        list.add(ac);
        if ((ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab)) {
            Collections.sort(list);
            System.out.println("Canh lon nhat dai: " + (list.get(0)));
            System.out.println("Chu vi hinh tam giac: " + (ab + bc + ac));
        }
        System.out.println("Đây không phải là tam giác");
    }

}


