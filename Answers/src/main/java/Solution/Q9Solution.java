package Solution;

public class Q9Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Tong hai so la: "+sum(12,23));
        }
        catch (Exception e ){
            System.out.println("Vui long nhap hai so");
        }

    }
    public static float sum(float a, float b){
        return a+b;
    }
}
