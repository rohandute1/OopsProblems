package com.bridgelabz.oops1;

import java.util.Scanner;

public class BankAccount {
    double balance;
    long accountNumber;
    BankAccount(double balance,long accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void moneyDeposit(){
        System.out.println("Please enter amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double updatedDepositBalance = balance + amount;
        System.out.println("Updated balance after deposit : " + updatedDepositBalance);
    }
    public void withdrawMoney(){
        System.out.println("Please enter amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amountWithdraw = sc.nextDouble();
        double updatedBalance = balance - amountWithdraw;
        System.out.println("Updated balance after deposit : " + updatedBalance);
    }
    public static void main(String[] args){
        System.out.println("1.Enter 1 if you want to deposit.\n" +
                "2.Enter 2 if you want to withdraw.");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch(option){
            case 1:
                BankAccount acc = new BankAccount(1000,123456789);
                acc.moneyDeposit();
                break;
            case 2:
                BankAccount acc1 = new BankAccount(1000,123456789);
                acc1.withdrawMoney();
                break;
        }
    }
}
