package ex11_java_basics;

public class Reverse_array {
    public static void main(String[] args){
        int[] arr = {1,2,5,8,9,66};
        for (int i = arr.length-1; i> 0; i--){
            System.out.println(arr[i]);
        }
    }
}
