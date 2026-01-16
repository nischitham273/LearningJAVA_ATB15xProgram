
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        System.out.println("Enter two integers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("The numbers that you have enterd are %d and %d\n", a, b);
        System.out.println("Enter which operation do you want to perform");
        String oper = scanner.next();
        // System.out.println(oper);
        oper = oper.toLowerCase();
        switch (oper){
            case "add":
                int add = a + b;
                System.out.printf("Addition of two numbers: %d\n", add);
                break;
            case "sub":
                int diff = a - b;
                System.out.printf("Substraction of two numbers: %d\n", diff);
                break;
            case "mul":
                int mul = a * b;
                System.out.printf("Multiplication of two numbers: %d\n", mul);
                break;
            case "div":
                int div = a / b;
                System.out.printf("Division of two numbers: %d\n", div);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}