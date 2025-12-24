package quiz;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Input run duration (minutes): ");
        int run_duration = inp.nextInt();

        double run_coefficient = 0.05;
        System.out.println("Input run coefficient: " + run_coefficient);

        int body_weight = 50;
        System.out.println("Input body weight: " + body_weight);

        System.out.print("Input average running speed (km/h): ");
        int run_speed = inp.nextInt();

        System.out.print("Input run altitude (meters): ");
        int run_altitude = inp.nextInt();

        double run_calories = (run_duration * run_coefficient * body_weight) + (run_speed * 0.5) + (run_altitude * 0.01);
        System.out.println("Run calories: " + run_calories);

        System.out.println("=========================");

        System.out.print("Input swim duration (minutes): ");
        int swim_duration = inp.nextInt();

        double swim_coefficient = 0.04;
        System.out.println("Input swim coefficient: " + swim_coefficient);

        System.out.println("Input body weight: " + body_weight);

        System.out.print("Input average swimming speed (km/h): ");
        int swim_speed = inp.nextInt();

        System.out.print("Input swim altitude (meters): ");
        int swim_altitude = inp.nextInt();

        double swim_calories = (swim_duration * swim_coefficient * body_weight) + (swim_speed * 0.5) + (swim_altitude * 0.01);
        System.out.println("Swim calories: " + swim_calories);

        System.out.println("=========================");

        System.out.print("Input cycling duration (minutes): ");
        int cycling_duration = inp.nextInt();

        double cycling_coefficient = 0.03;
        System.out.println("Input cycling coefficient: " + run_coefficient);

        System.out.println("Input body weight: " + body_weight);

        System.out.print("Input average cycling speed (km/h): ");
        int cycling_speed = inp.nextInt();

        System.out.print("Input cycling altitude (meters): ");
        int cycling_altitude = inp.nextInt();

        double cycling_calories = (cycling_duration * cycling_coefficient * body_weight) + (cycling_speed * 0.5) + (cycling_altitude * 0.01);
        System.out.println("Cycling calories: " + cycling_calories);

        System.out.println("=========================");

        double total_calories = run_calories + swim_calories + cycling_calories;
        System.out.println("Total calories used from all activity: " + total_calories);

        double average_calories = (run_calories + swim_calories + cycling_calories) / 3;
        System.out.println("Average calories burned: " + average_calories);

        inp.close();
    }
}
