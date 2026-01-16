package Assignments;
import java.util.Scanner;
public class weekdays {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 - 7");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            switch(n){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
