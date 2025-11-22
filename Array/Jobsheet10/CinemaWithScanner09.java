package Array.Jobsheet10;

import java.util.Scanner;

public class CinemaWithScanner09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String[][] audience = new String[4] [2];
        int row, column;
        String name, next;

        while (true) {
            System.out.print("Enter a name: ");
            name = inp.nextLine();
            System.out.print("Enter row number: ");
            row = inp.nextInt();
            System.out.print("Enter column number: ");
            column = inp.nextInt();
            inp.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audiences to be added? (Y/N): ");
            next = inp.nextLine();

            if (next.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
