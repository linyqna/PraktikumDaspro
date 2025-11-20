package Array.Jobsheet9;

import java.util.Scanner;

public class AverageScore09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0;
        double average;
        int passed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = inp.nextInt();
            if (score[i] > 70) {
                passed++;
            }
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        average = total / score.length;
        System.out.println("The class average score is " + average);
        System.out.println("The number of student Passed: " + passed);
    }
}
