package Loop.jobsheet11;

import java.util.Scanner;

public class Square3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input N (min 3): ");
        int N = inp.nextInt();

        if (N < 3) {
            System.out.println("N must be at least 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }   
}
