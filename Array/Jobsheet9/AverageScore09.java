package Array.Jobsheet9;

import java.util.Scanner;

public class AverageScore09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int student = inp.nextInt();

        int[] score = new int[student];
        double totalpassed = 0;
        double totalfailed = 0;
        double avpassed;
        double avfailed;
        int numpassed = 0;
        int numfailed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student final score " + (i + 1) + ": ");
            score[i] = inp.nextInt();

            if (score[i] > 70) {
                numpassed++;
                totalpassed += score[i];
            } else {
                numfailed++;
                totalfailed += score[i];
            }
        }

        avpassed = totalpassed / numpassed;
        avfailed = totalfailed / numfailed;
        System.out.println("The passed student average score " + avpassed);
        System.out.println("The failed student average score " + avfailed);
    }
}
