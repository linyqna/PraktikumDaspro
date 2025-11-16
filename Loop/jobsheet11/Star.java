package Loop.jobsheet11;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = inp.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.print("*");
        }
    }
}
