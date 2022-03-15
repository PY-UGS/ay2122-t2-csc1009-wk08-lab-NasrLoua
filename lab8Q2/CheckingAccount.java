package lab8Q2;

public class CheckingAccount {
    
    private double balance;
    private String number;


    public CheckingAccount(double balance, String number ){
        this.balance = balance;
        this.number = number;

    }

    public void deposit(double amount) {
        this.balance += amount;

    }

    public void withdraw(double amount) throws InsufficientFundsException{

        this.balance -= amount;

        if (amount > this.balance)
            throw new InsufficientFundsException(this.balance);   
        
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNumber() {
        return this.number;
    }



}
