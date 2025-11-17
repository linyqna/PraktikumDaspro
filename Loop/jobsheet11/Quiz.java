package Loop.jobsheet11;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random sub = new Random();

        char menu = 'y';
        do {
            int number = sub.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = inp.nextInt();
                inp.nextLine();
                success = (answer == number);
                
                if (!success) {
                    if (answer < number) {
                        System.out.println("Too low! Try a higher number.");
                    } else {
                        System.out.println("Too high! Try a lower number.");
                    }
                } else {
                    System.out.println("Correct! Well done.");
                }
            } while (!success);
            
            System.out.println("Do you want to repeat the game (Y?N): ");
            menu = inp.next().charAt(0);
            inp.nextLine();
        } while (menu == 'Y' || menu == 'y');
    }
}
