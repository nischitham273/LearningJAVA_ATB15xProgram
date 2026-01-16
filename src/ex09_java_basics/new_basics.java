package ex09_java_basics;

import java.util.Scanner;

public class new_basics {

    public static void main(String[] args) {

        long init_bal = 100000L;
        long deposit = 0;
        long credit = 0;
        long total_bal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Select the option for ATM:
                1 - Debit
                2 - Credit
                3 - Check Balance
                """);

        int n = scanner.nextInt();

        switch (n) {

            case 1:
                System.out.println("Enter amount to debit:");
                long debitAmount = scanner.nextLong();
                credit = debitAmount;
                total_bal = init_bal - credit;
                System.out.println("Total balance: " + total_bal);
                break;

            case 2:
                System.out.println("Enter amount to credit:");
                long creditAmount = scanner.nextLong();
                deposit = creditAmount;
                total_bal = init_bal + deposit;
                System.out.println("Total balance: " + total_bal);
                break;

            case 3:
                total_bal = init_bal + deposit - credit;
                System.out.println("Total balance: " + total_bal);
                break;

            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }
}
