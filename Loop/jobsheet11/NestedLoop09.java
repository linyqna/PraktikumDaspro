package Loop.jobsheet11;

import java.util.Scanner;

public class NestedLoop09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = inp.nextDouble();
            }
            System.out.println();
        }

        int cityNum = 1;
        for (double[] city : temps) {
            System.out.print("City " + cityNum + ": ");
            for (double t : city) {
                System.out.print(t + " ");
            }
            System.out.println();
            cityNum++;
        }
    }
}
