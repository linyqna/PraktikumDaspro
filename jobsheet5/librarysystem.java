package jobsheet5;

import java.util.Scanner;

public class librarysystem {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Library System with Yes/No input
        System.out.println("\n--- Library Access System ---");
        System.out.print("Do you have student ID? (Yes/No): ");
        String hasID = inp.nextLine().trim().toLowerCase();
        System.out.print("Have you registered online? (Yes/No): ");
        String onlineReg = inp.nextLine().trim().toLowerCase();
        
        boolean hasStudentID = hasID.equals("yes");
        boolean onlineRegistration = onlineReg.equals("yes");
        
        if (hasStudentID || onlineRegistration) {
            System.out.println("✓ Access granted to library");
        } else {
            System.out.println("✗ Access denied to library");
        }

    }
    
}
