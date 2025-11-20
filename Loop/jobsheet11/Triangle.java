package Loop.Jobsheet11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = inp.nextInt();

        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
