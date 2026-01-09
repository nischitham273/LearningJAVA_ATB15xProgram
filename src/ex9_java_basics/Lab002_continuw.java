package ex9_java_basics;

import java.util.Scanner;

public class Lab002_continuw {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            System.out.printf("intial %d\n",i);
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
