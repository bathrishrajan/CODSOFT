import java.util.Scanner;

public class Atm{
    private Account acc;
    private Scanner scan;

    public Atm(Account acc){
        this.acc = acc;
        this.scan = new Scanner(System.in);
    }
    
    public void display(){
        System.out.println("ATM MENU");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

    public void PT(){
        display();
        System.out.println("Enter the Option:");
        int opt = scan.nextInt;
        if(opt==1){
            deposit();
        }
        else if(opt==2){
            withdraw();
        }
        else if(opt==3){
            checkbal();
        }
        else if(opt==4){
            System.out.println("Thanks for Using Our ATM!");
        }
        else{
            System.out.println("Please enter the vaild option.");
        }
    }
}

public class Account{
    private double balance;
    
    public Account(double balance){
        this.balance = balance;
    }
    
    public double balance(){  return balance; }

    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("You Deposit the Amount of Rs."+amt);
            System.out.println("Your Account Balance is Rs."+balance);
        }
        else{
            System.out.println("Please enter the valid amount!");
        }
    }

    public void withdraw(double amt){
        if(amt > 0){
            balance -= amt;
            System.out.println("You Withdraw a amount of Rs."+amt);
            System.out.println("Your Account Balance is Rs."+balance);
        }
        else{
            System.out.println("Please enter the vaild Withdraw amount!");
        }
    }

    public void checkbal(){
        System.out.println("Your Account Balance is Rs."+balance);
    }
}

public class main{
    public static void main(String args[]){
        Account user = new Account(1000);
        Atm a = new Atm(user);
        a.PT();
    }
}

