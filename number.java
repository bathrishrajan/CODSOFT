import java.util.Random;
import java.util.Scanner;
public class number{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int total = 0;
        while(true){
            int guess = rand.nextInt(100) + 1;
            int attempt = 10;
            boolean guessc = false;
            System.out.println("New Round! I have generated a number between 1 to 100. You have 10 attempts to guess it.");
            while(attempt > 0){
                System.out.println("Enter your guess:");
                int user = scan.nextInt();

                if(user < guess){
                    System.out.println("Your guess is too low.");
                }
                else if(user > guess){
                    System.out.println("Your guess is too high.");
                }
                else{
                    guessc = true;
                    break;
                }
                attempt--;
                System.out.println("You have "+attempt+" attempts left.");
            }
            if(guessc){
                System.out.println("Correct! You've guessed the number.");
                total++;
            }
            else{
                System.out.println("Sorry! You've run out of attempts.The number was:"+guess);
            }
            System.out.println("Your current score is:"+total);
            System.out.println("Do you want to play again(Y/N):");
            String playagain = scan.next();
            if(!playagain.equalsIgnoreCase("Y")){
                break;
            }
        }
        System.out.println("Thanks for playing! Your final score is:"+total);
        scan.close();
    }
}