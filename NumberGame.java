import java.util.*;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");

        boolean flag = true;

        while (flag) {
            int num = rnd.nextInt(100) + 1;
            int atm = 0;
            final int maxAttempts = 10;
            boolean over = false;

            System.out.println("Can you guess the number which has been generated?");
            while (atm < maxAttempts && !over) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                atm++;

                if (guess == num) {
                    System.out.println("Congratulations! You guessed the number.");
                    over = true;
                    score += maxAttempts - atm + 1;
                } else if (guess < num) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!over) {
                System.out.println("Sorry! You have used all attempts. The number was " + num);
            }

            rounds++;

            System.out.print("Do you want to play another round? (yes/no): ");
            flag = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("The Game is over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Your score: " + score);

        sc.close();
    }
}
