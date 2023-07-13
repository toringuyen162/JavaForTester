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

    public void setId() {
        id = ("JAK-" + (int) (Math.random() * 100000));
        System.out.println("Ma so sinh vien: "+id);
    }

    public void setName(String name) {
        System.out.printf("Ten sinh vien: ");
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setMath(float math) {
        System.out.printf("Nhap diem Toan: ");
        if (math < 0 || math > 10) {
            System.out.println("Nhập điểm từ 0-10");
        } else this.math = math;
    }

    public void setPhysics(float physics) {
        System.out.printf("Nhap diem Ly: ");
        if (physics < 0 || physics > 10) {
            System.out.println("Nhập điểm từ 0-10");}
        else this.physics = physics;

    }
    public void setChemistry ( float chemistry){
        System.out.printf("Nhap diem Hoa: ");
        if (chemistry < 0 || chemistry > 10) {
            System.out.println("Nhập điểm từ 0-10");
        } else this.chemistry = chemistry;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao so sinh vien: ");
        int num = sc.nextInt();

        List<Q14SinhVien> list = new ArrayList<Q14SinhVien>();
        for (int i=0;i<num;i++){
            list.add(new Q14SinhVien());
        }

        for (int i=0;i<num;i++){
            var object = list.get(i);
            object.setId();
            sc.next();
            object.setName(sc.next());
            sc.next();
            object.setMath(sc.nextFloat());
            sc.next();
            object.setPhysics(sc.nextFloat());
            sc.next();
            object.setChemistry(sc.nextFloat());
        }
        sc.close();
        }

}


