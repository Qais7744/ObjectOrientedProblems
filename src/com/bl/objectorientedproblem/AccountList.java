package com.bl.objectorientedproblem;

import java.util.Scanner;

public class AccountList {
    static Scanner scanner = new Scanner(System.in);

    public static double debitMoney(double amount) {
        System.out.println("Enter the Amount to withdraw");
        double debitAmount = scanner.nextDouble();
        if (amount >= debitAmount)
            return amount - debitAmount;
        else {
            System.out.println("Exceeded the limit Please check balance");
            return amount;
        }
    }

    public static double addAmount(double amount) {
        System.out.println("Deposit The Money");
        double depositAmount = scanner.nextDouble();
        return depositAmount + amount;
    }

    public void mainOperation() {
        double amount = 0;
        while (true) {
            System.out.println("Enter The Money to Add Amount a to Debit Amount b to Check Balance E to Exit");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    amount = addAmount(amount);
                    System.out.println("the balance is " + amount);
                    break;
                case 'b':
                    amount = debitMoney(amount);
                    System.out.println("The Transaction is Successful");
                    System.out.println("The Balance is " + amount);
                    break;
                case 'e':
                    System.out.println("The Balance is " + amount);
                    break;
                default:
                    System.out.println("Unable to Process Entered Wrong Input");
                    break;

            }
            if (choice == 'e') {
                break;
            }
        }
    }
}
