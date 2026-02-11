//package ex10_java_basics;
//
//public class max_array {
//    int[] array1 = {11,55,6,588,468,1002};
//    int max = array1[0];
//    for(int i = 0; i < array1.length; i++){
//        if(max < array1[i]){
//            max = array1[i];
//        }
//        System.out.println("max" + max);
//    }
//}

package ex10_java_basics;

public class max_array {
    public static void main(String[] args) {
        int[] array1 = {11, 55, 6, 588, 468, 1002};
        int max = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }

        // Moved this outside the loop to print the final result once
        System.out.println("The maximum value is: " + max);
    }
}
