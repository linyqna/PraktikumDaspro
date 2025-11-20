package Loop.Jobsheet07;

import java.util.Scanner;

public class CafeDoWhile09 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int coffe, tea, bread;
        String name;
        double total, coprice = 12000, tepriece = 7000, brprice = 20000;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            name = inp.nextLine();
            if (name.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.print("Number of coffees: ");
            coffe = inp.nextInt();
            System.out.print("Number of teas: ");
            tea = inp.nextInt();
            System.out.print("Number of breads: ");
            bread = inp.nextInt();

            total = (coffe * coprice) + (tea * tepriece) + (bread * brprice);
            System.out.println("Total to be paid: Rp " + total);
            inp.nextLine();
        } while (true);
        
        System.out.println("All transactions completed.");
    }
    
}
