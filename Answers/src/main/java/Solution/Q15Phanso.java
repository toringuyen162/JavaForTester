package Solution;

import java.util.Scanner;

public class Q15Phanso {
    private int tu;
    private int mau;

    public Q15Phanso() {
    }

    public Q15Phanso(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        int mau = sc.nextInt();
        if (mau == 0) {
            System.out.printf("Nhap lai mau so khac 0: ");
            setMau();
        }
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public Q15Phanso sum(Q15Phanso p1) {
        int mauMoi = p1.getMau() * this.getMau();
        int tuMoi = p1.getTu() * this.getMau() + this.getTu() * p1.getMau();
        return new Q15Phanso(tuMoi, mauMoi);

    }

    public static Q15Phanso sum(Q15Phanso p1, Q15Phanso p2) {
        int mauMoi = p1.getMau() * p2.getMau();
        int tuMoi = p1.getTu() * p2.getMau() + p2.getTu() * p1.getMau();
        return new Q15Phanso(tuMoi, mauMoi);
    }

    public float findValue() {
        return (float) this.getTu() / this.getMau();
    }





    public static void main(String[] args) {

        Q15Phanso p1 = new Q15Phanso(5, 6);
        Q15Phanso p2 = new Q15Phanso(8, 9);
        Q15Phanso p3= new Q15Phanso(23,12);
        var sum = sum(p1, p2);
        System.out.println(sum.getTu() + "/" + sum.getMau());

    }


}
