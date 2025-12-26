package function.Jobsheet14;

import java.util.Scanner;

public class PrimeCheckingRecursive {
    static boolean isPrimeRecursive(int n, int d) {
        if (n <= 1) {
            return false;  // not prime
        } 
        if (d == 1) {
            return true;  // base case
        }
        if (n % d == 0) {
            return false; // divisible
        } else {
            return isPrimeRecursive(n, d - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = inp.nextInt();
        boolean prime = isPrimeRecursive(number, number - 1);
        System.out.println(number + " is prime? " + prime);

        inp.close();
    }
}
