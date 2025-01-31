package com.example.challenge78;

public class BankAccount {
    private String AccountNumber;
    private String AccountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;

    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("invalid deposit");
        } else {
            balance += money;
        }
    }
    public double withdrawMoney(double money){
        if(money<=0) {
            System.out.println("invalid withdraw");

        }else if(balance>=money){
            balance-=money;
        }else{
            money=balance;
            balance=0;
        }

        return money;

    }
}