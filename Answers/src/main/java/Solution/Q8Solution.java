package Solution;

public class Q8Solution {
    //Tìm chữ cái trả về là nguyên âm hay phụ âm
    public static void main(String[] args) {
        isVowel("a");
    }
    public static void isVowel(String i){
        if(i.length() !=1){
            throw new IllegalArgumentException(i+" phai la mot ky tu");
        }

        String vow = "ueoai";
        if(vow.contains((i.toLowerCase()))){
            System.out.println((i+" la nguyen am"));
        } else {
            System.out.println(i+" la phu am");
        }
    }
}
