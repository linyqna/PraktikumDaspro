package caseMethod;

import java.util.Scanner;

public class caseMethod1 {
       public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Name  : ");
        String name = inp.nextLine();
        System.out.print("NIM   : ");
        String nim = inp.nextLine();

        System.out.println("\n--- Course 1: Algorithms and Programming ---");
        System.out.print("Midterm Exam Score    : ");
        int uts1 = inp.nextInt();
        System.out.print("Final Exam Score      : ");
        int uas1 = inp.nextInt();
        System.out.print("Assignment Score      : ");
        int assg1 = inp.nextInt();

        System.out.println("\n--- Course 2: Data Structure ---");
        System.out.print("Midterm Exam Score    : ");
        int uts2 = inp.nextInt();
        System.out.print("Final Exam Score      : ");
        int uas2 = inp.nextInt();
        System.out.print("Assignment Score      : ");
        int assg2 = inp.nextInt();

        System.out.println("\n--- Course 3: Basic English ---");
        System.out.print("Midterm Exam Score    : ");
        int uts3 = inp.nextInt();
        System.out.print("Final Exam Score      : ");
        int uas3 = inp.nextInt();
        System.out.print("Assignment Score      : ");
        int assg3 = inp.nextInt();

        //average algoritm and programming
        double finaluts1;
        finaluts1 = uts1 * 0.3;
        double finaluas1 = uas1 * 0.4;
        double finalassg1 = assg1 * 0.3;
        double finalsc1 = finaluts1 + finaluas1 + finalassg1;

        // average data structure
        double finaluts2 = uts2 * 0.3;
        double finaluas2 = uas2 * 0.4;
        double finalassg2 = assg2 * 0.3;
        double finalsc2 = finaluts2 + finaluas2 + finalassg2;

        // average basic english
        double finaluts3 = uts3 * 0.3;
        double finaluas3 = uas3 * 0.4;
        double finalassg3 = assg3 * 0.3;
        double finalsc3 = finaluts3 + finaluas3 + finalassg3;


        //average all course
        double finalsc = (finalsc1 + finalsc2 + finalsc3) / 3;

        String grade1 = null;
        if (finalsc1 > 80 && finalsc1 <= 100) {
            grade1 = "A";
        } else if (finalsc1 > 73 && finalsc1 <= 80) {
            grade1 = "B+";
        } else if (finalsc1 > 65 && finalsc1 <= 73) {
            grade1 = "B";
        } else if (finalsc1 > 60 && finalsc1 <= 65) {
            grade1 = "C+";
        } else if (finalsc1 > 50 && finalsc1 <= 60) {
            grade1 = "C";
        } else if (finalsc1 > 39 && finalsc1 <= 50) {
            grade1 = "D";
        } else if (finalsc1 <= 39) {
            grade1 = "E";
        } 

        String grade2 = null;
        if (finalsc2 > 80 && finalsc2 <= 100) {
            grade2 = "A";
        } else if (finalsc2 > 73 && finalsc2 <= 80) {
            grade2 = "B+";
        } else if (finalsc2 > 65 && finalsc2 <= 73) {
            grade2 = "B";
        } else if (finalsc2 > 60 && finalsc2 <= 65) {
            grade2 = "C+";
        } else if (finalsc2 > 50 && finalsc2 <= 60) {
            grade2 = "C";
        } else if (finalsc2 > 39 && finalsc2 <= 50) {
            grade2 = "D";
        } else if (finalsc2 <= 39) {
            grade2 = "E";
        } 

        String grade3 = null;
        if (finalsc3 > 80 && finalsc3 <= 100) {
            grade3 = "A";
        } else if (finalsc3 > 73 && finalsc3 <= 80) {
            grade3 = "B+";
        } else if (finalsc3 > 65 && finalsc3 <= 73) {
            grade3 = "B";
        } else if (finalsc3 > 60 && finalsc3 <= 65) {
            grade3 = "C+";
        } else if (finalsc3 > 50 && finalsc3 <= 60) {
            grade3 = "C";
        } else if (finalsc3 > 39 && finalsc3 <= 50) {
            grade3 = "D";
        } else if (finalsc3 <= 39) {
            grade3 = "E";
        } 

        String status1;
        if (finalsc1 >= 60) {
            status1 = "PASS";
        } else {
            status1 = "NOT PASSED";
        }

        String status2;
        if (finalsc2 >= 60) {
            status2 = "PASS";
        } else {
            status2 = "NOT PASSED";
        }

        String status3;
        if (finalsc3 >= 60) {
            status3 = "PASS";
        } else {
            status3 = "NOT PASSED";
        }

        String semester;
        if (status1.equalsIgnoreCase("PASS") && status2.equalsIgnoreCase("PASS") && status3.equalsIgnoreCase("PASS")) {   
            if (finalsc >= 70) {
                semester = "PASS";
            } else {
                semester = "NOT PASSED";
            }
        } else{
            semester = "NOT PASSED";
        }


        System.out.println("\n========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Name    : " + name);
        System.out.println("NIM     : " + nim);

        System.out.println("\nCourse\t\t\t\tMidterm Exam\tFinal Exam\tAssignment\tLast Score\tGrade\tStatus");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.print("Algorithms and Programming\t" + uts1);
        System.out.print("\t\t" + uas1);
        System.out.print("\t\t" + assg1);
        System.out.print("\t\t" + finalsc1);
        System.out.print("\t\t" + grade1);
        System.out.println("\t" + status1);

        System.out.print("Data Structure\t\t\t" + uts2);
        System.out.print("\t\t" + uas2);
        System.out.print("\t\t" + assg2);
        System.out.print("\t\t" + finalsc2);
        System.out.print("\t\t" + grade2);
        System.out.println("\t" + status2);
        
        System.out.print("Basic English\t\t\t" + uts3);
        System.out.print("\t\t" + uas3);
        System.out.print("\t\t" + assg3);
        System.out.print("\t\t" + finalsc3);
        System.out.print("\t\t" + grade3);
        System.out.println("\t" + status3);

        System.out.println("\nAverage final Score: " + finalsc);
        System.out.println("Status Semester    : " + semester);

        inp.close();
    }
    
}
