package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String message = null;

        System.out.print("Has the student been cleared of compencation? (Y/T or Yes/No): ");
        String compensationStatus = inp.nextLine().trim();

        System.out.print("Enter the number of guidance logs with Supervisor 1: ");
        int supervisor1 = inp.nextInt();
        System.out.print("Enter the number of guidance logs with Supervisor 2: ");
        int supervisor2 = inp.nextInt();

        if (compensationStatus.equalsIgnoreCase("Yes")) {
            if (supervisor1 >= 8 && supervisor1 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4.";
            }
            else if (supervisor1 < 8 && supervisor2 >= 4) {
                message = "Failed Guidance logs with Supervisor 1 are fewer than 8.";
            } else if (supervisor1 >= 8 && supervisor2 < 4) {
                message = "Failed guidance logs with Supervisor 2 are fewer than 4.";
            }    
        } else {
            message = "Failed: the student has not been cleared of compensation.";
        }

        System.out.println(message);
    }
    
}
