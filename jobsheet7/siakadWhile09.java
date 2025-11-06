package jobsheet7;

import java.util.Scanner;

public class siakadWhile09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int grade, total, i = 0;

        System.out.print("Enter the number of students: ");
        total = inp.nextInt();

        while (i < total) {
            System.out.print("Enter the grade of the " + (i + 1) + " student is ");
            grade = inp.nextInt();
            
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Re-enter a valid grade!");
                continue;
            }

            if (grade > 80 && grade <= 100) {
                System.out.println("The grade of the " + (i + 1) + " student is A");
                System.out.println("Good, keep the grade!");
            } else if (grade > 73 && grade <= 80) {
                System.out.println("The grade of the " + (i + 1) + " student is B+");
            } else if (grade > 65 && grade <= 73) {
                System.out.println("The grade of the " + (i + 1) + " student is B");
            } else if (grade > 60 && grade <= 65) {
                System.out.println("The grade of the " + (i + 1) + " student is C+");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("The grade of the " + (i + 1) + " student is C");
            } else if (grade > 39 && grade <= 50) {
                System.out.println("The grade of the " + (i + 1) + " student is D");
            } else if (grade <= 39) {
                System.out.println("The grade of the " + (i + 1) + " student is E");
            }
            
            i++;
        }
    }
    
}
