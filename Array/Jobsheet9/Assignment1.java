package Array.Jobsheet9;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int student = inp.nextInt();

        int[] grades = new int [student];
        double average;
        double total = 0;
        double highest = 0;
        double lowest = 100;

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter student " + (i + 1) + " grade: ");
            grades[i] = inp.nextInt();
            total += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        average = total / student;
        System.out.println("The average grades  : " + average);
        System.out.println("The highest grades  : " + highest);
        System.out.println("The lowest grades   : " + lowest);
    }
}
