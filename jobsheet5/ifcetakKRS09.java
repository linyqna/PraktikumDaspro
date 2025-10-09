package jobsheet5;

import java.util.Scanner;

public class ifcetakKRS09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.println("Have the tuition fees been paid in full? (true/false): ");
        boolean uktLunas = inp.nextBoolean();

        if (uktLunas) {
            System.out.println("UKT payment has been verified");
            System.out.println("KRS now can be printed and you can ask the academic advisior to sign it.");

            //System.out.println("Dilarang mempersulit hidup orang.");
            
        }
    }
}
