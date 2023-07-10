package Solution;

public class Q7Solution {
    public static void main(String[] args) {
    isMin();
    }
    public static void isMin(){
        int[] array = {1, 8, 3, 7, -9, 10};
        int min = array[0];
        for (int i =1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
