package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q16Phanso {
    private int tu;
    private int mau;

    public Q16Phanso() {
    }

    public Q16Phanso(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        if (mau == 0) {
            System.out.printf("Nhap lai mau so khac 0: ");
        }
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }


    public static Q16Phanso sum(Q16Phanso p1, Q16Phanso p2) {
        int mauMoi = p1.getMau() * p2.getMau();
        int tuMoi = p1.getTu() * p2.getMau() + p2.getTu() * p1.getMau();
        return new Q16Phanso(tuMoi, mauMoi);
    }

    public float findValue() {
        return (float) (this.getTu() / this.getMau());
    }

    public static Q16Phanso comp(Q16Phanso p1, Q16Phanso p2) {
        if (p1.findValue() > p2.findValue()) {
            return p1;
        } else return p2;
    }


    public static void main(String[] args) {
        List<Q16Phanso> list = new ArrayList<>();
        list.add(new Q16Phanso(5, 6));
        list.add(new Q16Phanso(8, 9));
        list.add(new Q16Phanso(23, 12));
        list.add(new Q16Phanso(4, 100));
        var isMax = list.get(0);
        for (int i=0;i<list.size();i++){
            isMax=Q16Phanso.comp(isMax,list.get(i));
        }
        System.out.println("Phan so lon nhat la: "+isMax.getTu()+"/"+isMax.getMau());
    }
}
