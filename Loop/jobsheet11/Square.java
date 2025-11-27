package loop.Jobsheet11;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = inp.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
