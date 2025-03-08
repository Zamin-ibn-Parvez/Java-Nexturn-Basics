package BankingSystem;

abstract class BankAccount implements transaction{
    String accountNumber;
    double balance;

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Current balance: "+balance);
    }

    abstract void withdraw(double amount);

    //constructor
    public BankAccount(String accountNumber , int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    }
    
    interface transaction{
        void transfer(double amount,BankAccount account);
    }
    
    class SavingsAccount extends BankAccount implements transaction{
    
        public SavingsAccount(String accountNumber, int balance) {
                super(accountNumber, balance);
            }
        
            //Overriding the withdraw method
        void withdraw(double amount) {
            if(balance >=500){
                balance -= amount;
                System.out.println("Withdrawal successful");
                System.out.println("Current balance: "+balance);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
    
        //Overriding the transfer method
        public void transfer(double amount, BankAccount account) {
            balance -= amount;
            account.deposit(amount);
        }
    }
    class CurrentAccount extends BankAccount implements transaction{
    
        //Constructor
        public CurrentAccount(String accountNumber, int balance) {
            super(accountNumber, balance);
        }
    
    
    
        private final double OVERDRAFT_LIMIT = 5000;
        //Overriding the withdraw method
            void withdraw(double amount) {
                if (balance - amount >= -OVERDRAFT_LIMIT) {
                    balance -= amount;
                    System.out.println("Withdrawal successful");
                    System.out.println("Current balance: " + balance);
                } else {
                    System.out.println("Overdraft limit exceeded");
                }
            }
    
        public void transfer(double amount, BankAccount account) {
            if (balance - amount >= -OVERDRAFT_LIMIT) {
                balance -= amount;
                account.deposit(amount);
                System.out.println("Transfer successful");
            } else {
                System.out.println("Overdraft limit exceeded, transfer failed");
            }
        }
    }
    public class Banking {
    
        public static void main(String[] args) {
            BankAccount savings = new SavingsAccount("SAV123", 5000); 
            BankAccount current = new CurrentAccount("CUR456", 2000); 
        
            savings.deposit(1000); //New balance : 6000
    
            current.withdraw(3000); //New balance : -1000
    
            savings.transfer(1500, current); 

            current.transfer(6000, savings);

    }

}
