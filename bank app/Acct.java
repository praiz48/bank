import java.util.*;
public class Acct {
    private String username;
    private double acct_bal;

    Acct(String uname, double bal){
        this.acct_bal=bal;
        this.username=uname;
    }
    public void check_details(){
        System.out.println("user name : "+ username);
        System.out.println("account balance : "+ acct_bal);
    }
    public void deposit(double amount){
        try {
            if (amount>0) {
                acct_bal+=amount;
                System.out.println(amount +" successfully deposited");
                check_details();
            }
            else{
                System.out.println(" Failed!, amount must be greater than zero");
            }
        } catch (IllegalFormatException e) {
            System.out.println("Failed!, whole numbers only pls");
        }
    }
    public void withdraw(double amount){
        try {
            if (amount>0 && amount<acct_bal) {
                acct_bal-=amount;
                System.out.println(amount +" successfully withdrawn");
                check_details();
            }
            else{
                System.out.println(" Failed!, amount must be greater than zero and account balance");
            }
        } catch (IllegalFormatException e) {
            System.out.println("Failed!, whole numbers only pls");
        }
    
    }
    

    
}

