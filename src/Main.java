import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //take input from user
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter any S,P or R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User gave this input: " + userMove);

        char[] arr = {'S', 'P', 'R'};
        Random random = new Random();
        int guessNumber = random.nextInt(3);
        char computerMove = arr[guessNumber];
        System.out.println("Computer Move>>" + computerMove);

        if (userMove == computerMove)
        {
            System.out.println("Draw");
        }
        else if (userMove == 'S' && computerMove == 'R')
        {
            System.out.println("Computer Wins");
        }
        else if (userMove == 'R' && computerMove == 'P')
        {
            System.out.println("Computer Wins");
        }
        else if (userMove == 'P' && computerMove == 'S')
        {
            System.out.println("Computer Wins");
        }
        else
        {
            System.out.println("User Wins");
        }
    }
}