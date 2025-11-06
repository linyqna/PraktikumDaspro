package jobsheet7;

import java.util.Scanner;

public class siakad09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double grade;
        double highest = 0;
        double lowest = 100;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade of the  " + i + " student: ");
            grade = inp.nextDouble();

            if (grade > highest) {
                highest = grade;   
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
    }
}
