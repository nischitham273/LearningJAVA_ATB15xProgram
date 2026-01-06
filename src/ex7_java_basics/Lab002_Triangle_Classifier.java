package ex7_java_basics;

import java.util.Scanner;

public class Lab002_Triangle_Classifier {
    static void main(String[] args) {
        System.out.println("enter sides");
        Scanner scanner = new Scanner(System.in);
        int S1 = scanner.nextInt();
        int S2 = scanner.nextInt();
        int S3 = scanner.nextInt();
        if (S1 == S2 && S2 == S3) {
            System.out.println("Equilateral triangle");
        }
        else if (S1 == S2 || S2 == S3 || S3 == S1) {
            System.out.println("Isosceles triangle");
        }
        else {
            System.out.println("Scalar triangle");
        }

    }
}
