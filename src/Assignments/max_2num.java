package Assignments;
import java.util.Scanner;
public class max_2num {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String max = (a > b) ? "a is greater" : "b is greater";
            System.out.println(max);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
