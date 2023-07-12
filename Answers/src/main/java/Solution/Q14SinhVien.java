package Solution;

public class Q14SinhVien {
    private String id = ("JAK-" + (int) (Math.random() * 10000));
    private String name;
    private boolean sex;
    private float math;
    private float physics;
    private float chemistry;


    public Q14SinhVien( String name, boolean sex, float math, float physics, float chemistry) {
        this.name = name;
        this.sex = sex;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setMath(float math) {
        if (math < 0 || math > 10) {
            System.out.println("Nhập điểm từ 0-10");
        } else this.math = math;
    }

    public void setPhysics(float physics) {
        if (physics < 0 || physics > 10) {
            System.out.println("Nhập điểm từ 0-10");}
        else this.physics = physics;

    }
    public void setChemistry ( float chemistry){
        if (chemistry < 0 || chemistry > 10) {
            System.out.println("Nhập điểm từ 0-10");
        } else this.chemistry = chemistry;
    }


    public static void main(String[] args) {
        Q14SinhVien sv1 = new Q14SinhVien();
    }
    }


