package Assignments;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            if (n%2 == 0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
