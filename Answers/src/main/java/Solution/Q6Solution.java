package Solution;

public class Q6Solution {
    //tìm max
    public static void main(String[] args) {
        isMax();
    }
    public static void isMax(){
        int[] array = {1, 8, 3, 7, -9, 10};
        int max = array[0];
        for (int i =1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
