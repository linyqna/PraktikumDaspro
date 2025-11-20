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

        for (int i = 0; i < finalSc.length; i++) {
            if (finalSc[i] > 70) {
                System.out.println("Student " + i + " Passed!");
            } else {
                System.out.println("Student " + i + " Failed!");
            }
        }
    }
}
