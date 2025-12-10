package function;

import java.util.Scanner;

public class WeeklyGradesInput {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int n = inp.nextInt();
        System.out.print("Enter the number of week: ");
        int m = inp.nextInt();

        String[] students = new String[n];
        int[][] grades = new int[n][m];

        for (int i = 0; i < n; i++) {
            System.out.print("The name of student number " + (i+1) + ": ");
            students[i] = inp.next();
            for (int j = 0; j < m; j++) {
                System.out.print("Grade of " + students[i] + " Week " + (j+1) + ": ");
                grades[i][j] = inp.nextInt();
            }
        }

        System.out.println("\nGrade Data:");
        for (int i = 0; i < n; i++) {
            System.out.print(students[i] + ": ");
            for (int j = 0; j < m; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
