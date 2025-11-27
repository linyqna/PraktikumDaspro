package Array.Jobsheet10;

import java.util.Scanner;

public class Siakad09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number of student: ");
        int student = inp.nextInt();
        System.out.print("Enter the number of courses: ");
        int course = inp.nextInt();

        int[][] score = new int [student][course];

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            double sumEachStudent = 0;

            for (int j = 0; j < score[i].length; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                score[i][j] =inp.nextInt();
                sumEachStudent += score[i][j];
            }
            System.out.println("Average score: " + sumEachStudent / course);
        }

        for (int i = 0; i < 3; i++) {
            double sumEachCourse = 0;

            for (int j = 0; j < 4; j++) {
                sumEachCourse += score[i][j];
            }
            System.out.println("Course " + (i + 1) + ": " + (sumEachCourse / student));
        }
    }
}
