package function.Jobsheet14;

import java.util.Scanner;

public class PowerRecrusive09 {
    static int calculatePower (int base, int pow){
        if (pow == 0) {
            return 1;
        } else {
            return base * calculatePower(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Inpuut base mumber: ");
        int base = inp.nextInt();
        System.out.print("Input power number: ");
        int pow = inp.nextInt();

        System.out.println("Result of " + base + " power " + pow + " = " + 
        calculatePower(base, pow));

        inp.close();
    }
}
