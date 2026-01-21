package ex10_java_basics;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Entered string is:%s\n",name);
        String rev_str = " ";
        for(int i = name.length()-1; i >=0; i-- ) {
//            System.out.println(i);
            rev_str += name.charAt(i);
        }
        System.out.println("Reversed string " + rev_str);
    }
}
