package ex9_java_basics;

import java.util.Random;
import java.util.Scanner;

public class Lab004_guessthenum {
    static void main() {
        Random rand = new Random();
        int rand_numb = rand.nextInt(100);
//        System.out.println(rand_numb);
        Scanner scanner =  new Scanner(System.in);
        int attempt = 1;
        while(true){
            if(scanner.hasNextInt()){
                int n = scanner.nextInt();
                if(n>rand_numb){
                    System.out.println("entered number is high");
                    attempt++;
                }
                else if(n<rand_numb){
                    System.out.println("Entered number is low");
                    attempt++;
                }
                else{
                    System.out.println("Guessed correct number with total of attempt of " + attempt);
                    break;
                }
            }
            else{
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }
        }

    }
}
