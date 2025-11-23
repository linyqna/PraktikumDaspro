package Array.Jobsheet10;

import java.util.Scanner;

public class CinemaWithScanner09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String[][] audience = new String[4][2];
        int row, column, menu;
        String name, next;

        do {
            System.out.println("\n====Menu Options====");
        System.out.println("1. Input Audience Data");
        System.out.println("2. Show Audience List");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        menu = inp.nextInt();
        inp.nextLine();

        if (menu == 1) {
            System.out.println("\n--Audience Data--");
            while (true) {
                System.out.print("\nEnter a name: ");
                name = inp.nextLine();
                System.out.print("Enter row number: ");
                row = inp.nextInt();
                System.out.print("Enter column number: ");
                column = inp.nextInt();
                inp.nextLine();

                if (row >= 1 && row <= 4 && column >= 1 && column <= 2) {
                    if (audience[row - 1][column - 1] == null) {
                        audience[row - 1][column - 1] = name;
                        System.out.println("Audience data added.");
                    } else {
                        System.out.println("Seat [" + row + "][" + column + "] is already taken. Please choose another seat.");
                        continue;
                    }
                } else {
                    System.out.println("Invalid seat position.");
                }


                System.out.print("Are there any other audiences to be added? (Y/N): ");
                next = inp.nextLine();

                if (next.equalsIgnoreCase("N")) {
                    break;
                }
            }    
        } else if (menu == 2) {
            System.out.println("\n--Audience List--");
            for (int i = 0; i < audience.length; i++) {
                System.out.println("Audience in the row " + (i + 1) + (": ") + String.join(", ", audience[i]));
            }
        } else if (menu == 3) {
            System.out.println("Exiting program.");
        } else {
            System.out.println("Invalid input!");
        }
        } while (menu != 3);
    }
}
