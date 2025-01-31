package com.example.challenge78;

public class customer {
    public static void main(String[] args) {
        BankAccount Account=new BankAccount("001A","Divya");
        Account.depositMoney(100);
        System.out.println(Account.withdrawMoney(200));
        Account.depositMoney(-40);
        Account.withdrawMoney(0);
    }
}
