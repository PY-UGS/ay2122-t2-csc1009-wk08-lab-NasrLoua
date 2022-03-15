package lab8Q2;

import java.util.*;

public class BankDemoTest {


    public static void main(String[] args) {
        double amount1, amount2;
        CheckingAccount a = new CheckingAccount(0, "11-132562");
        Scanner input = new Scanner(System.in);

        try{

        System.out.print("Please enter the amount you would like to deposit: $");
        amount1 = input.nextDouble();
        a.deposit(amount1);
        
        System.out.print("Please enter the amount you would like to withdraw: $");
        amount2 = input.nextDouble();
        a.withdraw(amount2);
        
        
        if (amount1 > amount2)
            System.out.println("The balance after withdraw is: $" + a.getBalance());
    

        }catch (InsufficientFundsException e){

            System.out.println(e + ": Sorry, but your account is short by: $ " + (-e.getAmount()));
        }
        
        input.close();
    }
    
}
