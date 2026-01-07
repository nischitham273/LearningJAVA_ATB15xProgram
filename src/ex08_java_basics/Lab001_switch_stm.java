package ex08_java_basics;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab001_switch_stm {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number from 1 to 6");
        if(scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
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
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("invalide");
                    break;
            }
        }
        else {
            System.out.println("Its invalid input");
        }


    }
}
