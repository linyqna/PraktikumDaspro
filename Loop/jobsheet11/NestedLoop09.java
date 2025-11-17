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

        for (int i = 0; i < temps.length; i++) {
            double sum = 0;
            for (int j = 0; j < temps[i].length; j++) {
                sum += temps[i][j];
            }
            double avg = sum / temps[i].length;
            System.out.println("Average of City " + (i + 1) + ": " + avg);
        }
    }
}
