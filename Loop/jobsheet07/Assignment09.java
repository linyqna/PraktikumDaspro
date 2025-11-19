package Loop.jobsheet07;

import java.util.Scanner;

public class Assignment09 {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);

        System.out.print("Enter Task: ");
        int task = inp.nextInt();

        switch (task) {
            case 1:
                CaseStudy.number1();
                break;
            case 2:
                CaseStudy.number2();
            default:
                break;
        }
    }
}

class CaseStudy {
    public static void number1() {
        Scanner inp = new Scanner(System.in);

        int tickets;
        double discount = 0, price = 50000, total = 0, payment;

        while (true) {
            System.out.print("Enter total number of tickets: ");
            tickets = inp.nextInt();

            if (tickets == 0) {
                break;
            } else if (tickets < 0) {
                System.out.println("Input invalid. Please re-input total tickets!");
                continue;
            }

            if (tickets > 10) {
                discount = 0.1;
            } else if (tickets > 4) {
                discount = 0.15;
            }

            payment = tickets * price * (1 - discount);
            total += payment;

            System.out.println("Total payment: Rp " + payment);
        }

        System.out.println("Total tickets sales today: Rp " + total);

    }
    public static void number2() {
        Scanner inp = new Scanner(System.in);

        int hours;
        String vehicle;
        double total = 0, fee = 0;

        do {
            System.out.print("Enter vehicle type (car/motor, type '0' to stop): ");
            vehicle = inp.nextLine();

            if (vehicle.equals("0")) {
                break;
            }

            System.out.print("Enter packing duration (hours): ");
            hours = inp.nextInt();
            inp.nextLine();

            if (hours > 5) {
                fee = 12500;
            } else if (vehicle.equalsIgnoreCase("car")) {
                fee = hours * 3000;
            } else if (vehicle.equalsIgnoreCase("motor")) {
                fee = hours * 2000;
            } else {
                System.out.println("Invalid vehicle type!");
                continue;
            }

            System.out.println("Parking fee: Rp " + fee);
            total += fee;

        } while (true);

        System.out.println("Total parking income: Rp " + total);

    }
}