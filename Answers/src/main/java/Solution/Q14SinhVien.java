package Solution;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q14SinhVien {
    private String id;
    private String name;
    private boolean sex;
    private float math;
    private float physics;
    private float chemistry;

    public Q14SinhVien(){};

    public void setId(String id) {
        System.out.printf("Ma sinh vien: ");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("Ten sinh vien: ");
        this.name = name;
    }

    public void setSex(boolean sex) {
        System.out.printf("Nhap gioi tinh: (true = nam, false = nu: ");
        this.sex = sex;
    }

    public void setMath(float math) {
        System.out.printf("Nhap diem toan: ");
        if (math < 0 || math > 10) {
            System.out.println("Nhập điểm từ 0-10");
            return;
        } else this.math = math;
    }

    public void setPhysics(float physics) {
        System.out.printf("Nhap diem ly: ");
        if (physics < 0 || physics > 10) {
            System.out.println("Nhập điểm từ 0-10");
            return;
        } else this.physics = physics;

    }

    public void setChemistry(float chemistry) {
        System.out.println("Nhap diem hoa: ");
        if (chemistry < 0 || chemistry > 10) {
            System.out.println("Nhập điểm từ 0-10");
            return;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Vui long nhap so luong sinh vien: ");
        sc.nextLine();
            Q14SinhVien q14SinhVien = new Q14SinhVien();
            //set ten sinh vien random
            q14SinhVien.setId("JAK-"+Integer.toString((int) (Math.random()*1000)));
            System.out.println(q14SinhVien.getId());
            q14SinhVien.setName(sc.nextLine());
            q14SinhVien.setSex(sc.nextBoolean());
            q14SinhVien.setMath(sc.nextFloat());
            q14SinhVien.setMath(sc.nextFloat());
            q14SinhVien.setMath(sc.nextFloat());




    }

}


