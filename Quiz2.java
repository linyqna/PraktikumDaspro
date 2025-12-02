package quiz;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[][] sales = {
            {2, 3, 4, 6},
            {3, 3, 3, 2},
            {4, 4, 5, 5},
            {1, 3, 3, 8},
            {2, 2, 2, 2}
        };
        String[][] employee = {
            {"Sito"},
            {"Semi"},
            {"Risma"},
            {"Vero"},
            {"Barri"}
        };
        String[] month = {"Jan", "Feb", "March", "April"};
        int menu;
        double price = 1000000;
        double total = 0;
        double discount = price * 0.05;

        do {
            System.out.println("\n===Menu===");
            System.out.println("1. Show sales summary");
            System.out.println("2. Show total sales per month");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            menu = inp.nextInt();
            inp.nextLine();

            if (menu == 1) {
                System.out.println("\n\t" + month[0] + "\t\t" + month[1] + "\t\t" + month[2] + "\t\t" + month[3]);
                for (int i = 0; i < sales.length; i++) {
                    total = sales[i].length * price;
                    System.out.println(employee[i][0] + "\t" + sales[i][0] * price + "\t" + (sales[i][1] * (price - discount)) + "\t" + sales[i][2] * price + "\t" + sales[i][3] * price);
                }
                inp.nextLine();
            } else if (menu == 2) {
                System.out.println("\n--Total Sales Per Month--");
                for (int i = 0; i < sales.length; i++) {
                    total = (sales[i][0] * price) + (sales[i][1] * (price - discount)) + (sales[i][2] * price) + (sales[i][3] * price);
                    System.out.println(month[i] + ": " + (int)total);
                }
            } else if (menu == 3) {
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid input!");
            }
            
        } while (menu != 3);
    }
}
