package ex16_java_basics;

import java.util.Scanner;

public class Lab001_exception {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
        int b = 100/score;
        System.out.println(b);
    }
}
