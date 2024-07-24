package Projects;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetno=6789;
        int guess =0;
        System.out.println("Enter Guess number: ");
        while (guess != targetno) {
            System.out.println("Enter number: ");
            guess=sc.nextInt();
            if(guess>6789){
                System.out.println("Your number is Too High..");
            }
            else if(guess<6789){
                System.out.println("Your number is Too Low..");
            }
            else
                System.out.println("You guessed the Number: " + guess);
        }

    }
}
