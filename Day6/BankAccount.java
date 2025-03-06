package Day6;

import java.util.*;

class BankAccountEx{
    String accountHolder;
    int accountNumber;
    private int balance;

    BankAccountEx(){
        this.accountHolder = "John";
        this.accountNumber = 12345;
        this.balance = 5000;
    }

    BankAccountEx(String name, int accNumber, int balance ){
        this.accountHolder = name;
        this.accountNumber = accNumber;
        this.balance = balance;
    }



    void showBalance(){
        if(balance>0)
            System.out.println("The current balance is $:" + balance );

        else{
            System.out.println("Invalid!!!");
        }
    }

    void depositMoney(int deposit){
        if(deposit>0)
            balance+=deposit;
        else
            System.out.println("Invalid!!!");
    }

    void withdrawMoney(int withdraw){
        if(withdraw > 0 && withdraw<balance){
            balance-=withdraw;
        }
        else{
            System.out.println("There is insufficient balance in your account");
        }
    }
}
public class BankAccount{

    public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);



        BankAccountEx firstAccount = new BankAccountEx();

        System.out.println("Enter the initial balance that needs to be in the account");
        int initialBalance = sc.nextInt();

        BankAccountEx SecondAccount = new BankAccountEx("Zamin", 4567 , initialBalance);

        System.out.println("This account belongs to "+ SecondAccount.accountHolder);

        System.out.println("Depositing money in "+SecondAccount.accountHolder + "'s account ");

        System.out.println("Enter the money to deposit :");
        int n = sc.nextInt();

        SecondAccount.depositMoney(n);

        SecondAccount.showBalance();

        System.out.println("Enter the money that needs to be withdrawn");

        int moneyWithdraw = sc.nextInt();
        SecondAccount.withdrawMoney(moneyWithdraw);

        SecondAccount.showBalance();


    }

}
