package function.Jobsheet14;

import java.util.Scanner;

public class ProvitRecursiveStudent09 {
    static double calculateProfit (double balance, int period) {
        if (period == 0) {
            return balance;
        } else {
            return 1.11 * calculateProfit(balance, period - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input balance: ");
        double balance = inp.nextDouble();
        System.out.print("Input period: ");
        int period = inp.nextInt();

        System.out.println("Balance after " + period + " year = " + 
        calculateProfit(balance, period));

        inp.close();
    }
}
