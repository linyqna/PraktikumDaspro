package caseStudy;

import java.util.Scanner;

public class jobsheet13 {
    static final int MAX = 100;
    static String[] name = new String[MAX];
    static String[] id = new String[MAX];
    static double[] gpa = new double[MAX];
    static String[] type = new String[MAX];
    static double[] income = new double[MAX];
    static int count = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n========================================");
            System.out.println("\tSCHOLARSHIP REGRISTRATION");
            System.out.println("========================================");
            System.out.println("1. Add new applicant");
            System.out.println("2. Show all applicants");
            System.out.println("3. Search applicants by scholarsship type");
            System.out.println("4. Calculate average GPA per scholarship type");
            System.out.println("0. Exit");
            System.out.print("Enter menu: ");
            menu = inp.nextInt();
            inp.nextLine();

            switch (menu) {
                case 1: 
                    add(inp); 
                    break;

                case 2: 
                    display(); 
                    break;

                case 3: 
                    search(inp); 
                    break;

                case 4: 
                    average(); 
                    break;

                case 0: 
                    System.out.println("Thank you. Program finished."); 
                    break; 

                default: 
                    System.out.println("Invalid input!");
            }
        } while (menu != 0);
    }

    static void add(Scanner inp){
        if (count >= MAX) {
            System.out.println("Data full!");
            return;
        }

        System.out.println("\n=== Add New Scholarship Applicant ===");
        System.out.print("Student name\t: ");
        name[count] = inp.nextLine();
        System.out.print("Student ID\t: ");
        id[count] = inp.nextLine();
        System.out.print("Latest GPA\t: ");
        gpa[count] = inp.nextDouble();
        inp.nextLine();

        System.out.println("Scholarship type: ");
        System.out.println("1. Regular");
        System.out.println("2. Excellent");
        System.out.println("3. Research");
        System.out.print("Enter your scholarship type: ");
        String types = inp.nextLine();

        if (!(types.equalsIgnoreCase("Regular") || types.equalsIgnoreCase("Excellent") || types.equalsIgnoreCase("Research"))) {
            System.out.println("Invalid scholarship type!");
            return;
        }
        type[count] = types;

        System.out.print("Parent's income (max 2000000): ");
        double incomes = inp.nextDouble();
        inp.nextLine();
        
        if (incomes > 2000000) {
            System.out.println("Income does not qualify for scholarship registration.");
            return;
        } else {
            income[count] = incomes;
        }
        
        count++;
        System.out.println(">> Applicant data has been added.");
    }
    
    static void display(){
        System.out.println("\n=== List of All Scholarship Applicant ===");
        if (count == 0) {
            System.out.println("No applicant data yet.");
            return;
        }
        System.out.printf("%-15s %-10s %-5s %-12s %-10s\n", "Name", "ID", "GPA", "Type", "Income");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s %-10s %-5.2f %-12s %-10.0f\n",
                    name[i], id[i], gpa[i], type[i], income[i]);
        }
    }

    static void search(Scanner inp){
        System.out.println("\nEnter shcolarship type to search.");
        System.out.println("1. Regular");
        System.out.println("2. Excellent");
        System.out.println("3. Research");
        System.out.print("Type to search: ");
        String search = inp.nextLine();
        boolean found = false;

        System.out.printf("%-15s %-10s %-5s %-12s %-10s\n", "Name", "ID", "GPA", "Type", "Income");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            if (type[i].equalsIgnoreCase(search)) {
                System.out.printf("%-15s %-10s %-5.2f %-12s %-10.0f\n",
                        name[i], id[i], gpa[i], type[i], income[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No applicants found for this type");
        }
    }

    static void average(){
        String[] scholarshipTypes = {"Regular", "Excellent", "Research"};

        for ( String types : scholarshipTypes) {
            double totalGPA = 0;
            int totalApplicants = 0;

            for (int i = 0; i < count; i++) {
                if (type[i].equalsIgnoreCase(types)) {
                    totalGPA += gpa[i];
                    totalApplicants++;
                }
            }

            if (totalApplicants > 0) {
                double avg = totalGPA / totalApplicants;
                System.out.printf("Average GPA for %s: %.2f\n", types, avg);
            } else {
                System.out.printf("No applicants for %s.\n", types);
            }
        }
    }
}
