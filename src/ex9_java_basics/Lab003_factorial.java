package ex9_java_basics;

import java.util.Scanner;

public class Lab003_factorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                fact = fact * i;
            }
            System.out.printf("Fctorial of n %d", fact);
        }
        else{
            System.out.printf("Invalid input");
        }
    }
}
