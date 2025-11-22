package Array.Jobsheet10;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] survey = new int[10][6];

        // Input data survei
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
            }
        }

        // Rata-rata per responden
        System.out.println("\nRata-rata per Responden:");
        for (int i = 0; i < survey.length; i++) {
            int total = 0;
            for (int j = 0; j < survey[i].length; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / survey[i].length;
            System.out.printf("Responden %d: %.2f\n", i + 1, rata);
        }

        // Rata-rata per pertanyaan
        System.out.println("\nRata-rata per Pertanyaan:");
        for (int j = 0; j < survey[0].length; j++) {
            int total = 0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / survey.length;
            System.out.printf("Pertanyaan %d: %.2f\n", j + 1, rata);
        }

        // Rata-rata keseluruhan
        int totalKeseluruhan = 0;
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (survey.length * survey[0].length);
        System.out.printf("\nRata-rata Keseluruhan: %.2f\n", rataKeseluruhan);
    }
}