package function.Jobsheet14;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0; // base case
        }
        if (n == 1) {
            return 1; // base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
        }
    }

public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Input month: ");
    int month = inp.nextInt();
    int result = fibonacci(month);
    System.out.println("Guinea pig pairs at month " + month + " = " + result);

    inp.close();
    }
}
