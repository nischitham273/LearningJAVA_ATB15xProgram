package ex11_java_basics;

public class Sorting {
    public static void main(String[] args){

        int[] arr = {12, 56, 78, 5, 96, 45};

        for(int i = 0; i < arr.length - 1; i++){

            for(int j = 0; j < arr.length - 1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}