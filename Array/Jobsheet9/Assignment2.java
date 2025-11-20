package Array.Jobsheet9;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("The number of order: ");
        int order = inp.nextInt();
        inp.nextLine();

        String[] name = new String[order];
        double[] price = new double[order];
        double cost = 0;

        for (int i = 0; i < order; i++) {
            System.out.print("Enter name of food/drink " + (i + 1) + ": ");
            name[i] = inp.nextLine();

            System.out.print("Enter price of " + name[i] + ": ");
            price[i] = inp.nextDouble();
            inp.nextLine();

            cost += price[i];
        }
        System.out.println("\n----List of Order----");
        for (int i = 0; i < order; i++) {
            System.out.println((i + 1) + ". " + name[i] + ": Rp " + price[i]);
        }
        System.out.println("Total cost of all orders: " + cost);
    }
}
