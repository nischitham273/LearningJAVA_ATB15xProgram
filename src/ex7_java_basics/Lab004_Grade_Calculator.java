package ex7_java_basics;

import java.util.Scanner;

public class Lab004_Grade_Calculator {
    static void main() {
        System.out.println("enter score");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score <= 100 && score >= 90){
            System.out.println("Grade A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("Grade B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Grade C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }

    }
}
