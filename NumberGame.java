import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random r= new Random();
        System.out.println("Welcome to the Number Game World!");
        char choice;
        do{
            int randomNumber = r.nextInt(100 -1) + 1;
            int attempts = 1;
            System.out.println("you have only 8 attempt to win this Game");
            while (attempts <= 8){
                System.out.println("Enter the number: ");
                int number = a.nextInt();
                if(number == randomNumber){
                    int score = ((8 - attempts) * 100) / 8;
                    System.out.println("Great! you win" +
                            "\n Your Score is " + score +"%");
                    break;
                }else {
                    if (number > randomNumber){
                        System.out.println("oops! too high");
                    }else{
                        System.out.println("oops! too low");
                    }
                }

                attempts += 1;

                if(attempts > 8){
                    System.out.println("oho! you lost the Game");
                }else {
                    System.out.println("Try again");
                }

            }
            System.out.println("Do you want to Play again? \n Press 'R' other wise Press 'any key'");
            choice = a.next().charAt(0);
        }while (choice == 'r' || choice == 'R');
    }
}