package Loop.Jobsheet11;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input N (min 5): ");
        int N = inp.nextInt();

        if (N < 3) {
            System.out.println("N must be at least 5.");
            return;
        }

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
