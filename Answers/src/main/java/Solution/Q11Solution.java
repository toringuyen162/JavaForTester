package Solution;

public class Q11Solution {
    public static void main(String[] args) {
    print(6);
    }

    public static void print(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.printf(j+" ");
            }
            System.out.print("\n");
        }
    }
}
