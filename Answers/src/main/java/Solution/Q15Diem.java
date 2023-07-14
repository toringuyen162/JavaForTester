package Solution;

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
        } else this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Q15Diem p1 = new Q15Diem();
    }

}
