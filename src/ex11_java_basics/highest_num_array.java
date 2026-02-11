package ex11_java_basics;

public class highest_num_array {
    public static void main(String[] args){
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int high = numbers[0];
        int sec_high = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] > high) {
                high = numbers[i];
            }
        }
        System.out.println("highest number "+high);
    }
}
