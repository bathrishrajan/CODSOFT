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

    Public void deposit(){

    }
}


