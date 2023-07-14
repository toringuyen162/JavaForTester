package Solution;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14SinhVien {
    private String id;
    private String name;
    private boolean sex;
    private float math;
    private float physics;
    private float chemistry;


    public Q14SinhVien() {
    }

    public Q14SinhVien(String name, boolean sex, float math, float physics, float chemistry) {
        this.name = name;
        this.sex = sex;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void setId() {
        id = ("JAK-" + (int) (Math.random() * 100000));
        System.out.println("Ma so sinh vien: " + id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setMath(float math) {

        if (math < 0 || math > 10) {
            System.out.printf("Nhập điểm từ Toán 0-10");
        } else this.math = math;
    }

    public void setPhysics(float physics) {
        if (physics < 0 || physics > 10) {
            System.out.printf("Nhập điểm lý từ 0-10");
        } else this.physics = physics;

    }

    public void setChemistry(float chemistry) {
        if (chemistry < 0 || chemistry > 10) {
            System.out.printf("Nhập điểm Hoá từ 0-10");
        } else this.chemistry = chemistry;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public float getMath() {
        return math;
    }

    public float getPhysics() {
        return physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public float avgScore(float math, float physics, float chemistry) {
        return (math * 3 + physics * 2 + chemistry) / 6;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Nhap vao so sinh vien: ");
//        int num = sc.nextInt();
//        List<Q14SinhVien> list = new ArrayList<Q14SinhVien>();
//        for (int i=0;i<num;i++){
//            list.add(new Q14SinhVien());
//        }
//        for (int i=0;i<num;i++) {
//            var object = list.get(i);
//            object.setId();
//            System.out.printf("Ten sinh vien: ");
//            object.setName(sc.next());
//            System.out.printf("Nhap gioi tinh: ");
//            object.setSex(sc.nextBoolean());
//            System.out.printf("Nhap diem Toan: ");
//            object.setMath(sc.nextFloat(), sc);
//            System.out.printf("Nhap diem Ly: ");
//            object.setPhysics(sc.nextFloat(), sc);
//            System.out.printf("Nhap diem Hoa: ");
//            object.setChemistry(sc.nextFloat(), sc);
//        }
        List<Q14SinhVien> list = new ArrayList<Q14SinhVien>();
        list.add(new Q14SinhVien("Thuỳ", true, 2, 9, 7));
        list.add(new Q14SinhVien("Long", false, 2, 4, 10));
        list.add(new Q14SinhVien("Nga", true, 3, 5, 7));
        list.add(new Q14SinhVien("Hương", false, 10, 4, 9));
        var svMax = list.get(0);
        var avgMax = svMax.avgScore(svMax.getMath(), svMax.getPhysics(), svMax.getChemistry());
        for (Q14SinhVien i : list) {
            var avgScore = i.avgScore(i.getMath(), i.getPhysics(), i.getChemistry());
            if (avgScore > avgMax) {
                avgMax = avgScore;
                svMax = i;
            }
        }
        System.out.println("Diem trung binh toi da la: " + avgMax);
        System.out.println("Sinh vien co diem trung binh toi da la: " + svMax.getName());

    }

}


