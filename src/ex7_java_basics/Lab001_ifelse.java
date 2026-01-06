package ex7_java_basics;

import java.util.Scanner;

public class Lab001_ifelse {
    static void main(String[] args) {
//        System.out.println("enter data using CLI");
//        int age = Integer.parseInt(args[0]);
//        System.out.println(age);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        if (age > 18){
            System.out.println("can vote");}
        else{
            System.out.println("cannot vote");}


    }
}
