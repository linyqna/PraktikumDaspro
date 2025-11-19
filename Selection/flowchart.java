package Selection;

import java.util.Scanner;

public class flowchart {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("===Even/Odd Number Checker===");
        System.out.println("enter the number: ");
        int angka = inp.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else{
            System.out.println("Ganjil");
        }
    }
}
