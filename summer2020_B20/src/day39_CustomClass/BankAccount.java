package day39_CustomClass;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {

    String accountHolder;
    long accountNumber;

    double balance;

    public void getAccountInfo(){ // displays account info
        System.out.println("============================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
        System.out.println("============================");
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount;
    }



}


