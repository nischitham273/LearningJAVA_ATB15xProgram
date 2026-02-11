package ex12_java_basics;

public class sec_highest {
    public static void main(String[] args){
        int arr[] = {12, 34, 10, 1, 100, 3, 4, 32};
        int high = 0;
        int sec_high = 0;
        for(int i=0; i<=arr.length-1; i++){
//            System.out.println(i);
            if(arr[i] > high) {
                sec_high = high;
                high = arr[i];
            }else if (arr[i] > sec_high && arr[i] != high) {
                sec_high = arr[i];
            }
        }
        System.out.println("First highest: " + high);
        System.out.println("Second highest: " + sec_high);
    }
}
