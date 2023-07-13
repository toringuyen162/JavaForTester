package Solution;

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

    public void setMath(float math, Scanner sc) {

        if (math < 0 || math > 10) {
            System.out.printf("Nhập điểm từ Toán 0-10");
            setMath(sc.nextFloat(), sc);
        } else this.math = math;
    }

    public void setPhysics(float physics, Scanner sc) {
        if (physics < 0 || physics > 10) {
            System.out.printf("Nhập điểm lý từ 0-10");
            setPhysics(sc.nextFloat(), sc);
        } else this.physics = physics;

    }

    public void setChemistry(float chemistry, Scanner sc) {
        if (chemistry < 0 || chemistry > 10) {
            System.out.printf("Nhập điểm Hoá từ 0-10");
            setChemistry(sc.nextFloat(), sc);
        } else this.chemistry = chemistry;
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

    public void avgScore(float math, float physics, float chemistry) {
        float avg = (math * 3 + physics * 2 + chemistry) / 6;
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

        Q14SinhVien sv1 = new Q14SinhVien("Thuỳ",true,8,9,7);
        Q14SinhVien sv2 = new Q14SinhVien("Long",false,2,4,10);
        Q14SinhVien sv3 = new Q14SinhVien("Nga",true,3,5,7);
        sv1.avgScore(sv1.getMath(),sv1.getPhysics(),sv1.getChemistry());
        sv2.avgScore(sv2.getMath(),sv2.getPhysics(),sv2.getChemistry());
        sv3.avgScore(sv3.getMath(),sv3.getPhysics(),sv3.getChemistry());

        }

}


