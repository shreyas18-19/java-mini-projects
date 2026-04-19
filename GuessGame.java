import java.util.Scanner;
import java.util.Random;

class GuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100);

        int guess;

        while(true) {

            System.out.println("Enter your guess:");
            guess = sc.nextInt();

            if(guess > number) {
                System.out.println("Too High!");
            }
            else if(guess < number) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct Number!");
                break;
            }
        }

        sc.close();
    }
}