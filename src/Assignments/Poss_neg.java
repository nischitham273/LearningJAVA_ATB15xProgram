package Assignments;
import java.util.Scanner;
public class Poss_neg {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            if(n > 0){
                System.out.println("Possitive number");
            }
            else if(n < 0){
                System.out.println("Negative Number");
            }
            else{
                System.out.println("Number is zero");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
