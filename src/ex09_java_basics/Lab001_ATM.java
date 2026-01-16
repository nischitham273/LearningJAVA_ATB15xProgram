package ex09_java_basics;

import java.util.Scanner;

public class Lab001_ATM {
    public static void main(String[] args)
    {
        long init_bal = 100000l;
        long total_bal;
        long deposit = 0;
        long credit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the option for ATM \n 1 - debit, \n 2 - credit \n 3 - to check total balance\n ");
        int n = scanner.nextInt();
//        System.out.println(n);
        if (scanner.hasNextInt()){
            switch (n){
                case 1:
                    System.out.println("how much you want deposit");
                    long dep_amount = scanner.nextLong();
                    total_bal = init_bal - dep_amount;
                    deposit = dep_amount;
                    System.out.println("Total balance: " + total_bal);
                    break;
                case 2:
                    System.out.println("how much you want to credit");
                    long cre_amount = scanner.nextLong();
                    total_bal = init_bal + cre_amount;
                    credit = cre_amount;
                    System.out.println("Total balance: "+ total_bal);
                    break;
                case 3:
                    System.out.println("total balance is:");
                    total_bal = init_bal + deposit - credit;
                    System.out.println("Total:"+total_bal);
                    break;
                default:
                    System.out.println("Not an option");
                    break;
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
