package Array.Jobsheet9;

import java.util.Scanner;

public class Value09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] finalSc = new int[10];

        for (int i = 0; i < finalSc.length; i++) {
            System.out.print("Enter the final score " + (i + 1) + ": ");
            finalSc[i] = inp.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Final score " + (i + 1) + " is " + finalSc[i]);
        }
    }
}
