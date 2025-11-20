package Array.Jobsheet9;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String[] menu = {
            "Cheesecake", "Cookie", "Cupcake", "Ice Cream", "Parfait", "americano", "Latte", "Machiato"
        };

        String name;

        System.out.print("Search menu: ");
        name = inp.nextLine();

        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(name + " is available on the menu.");
        } else {
            System.out.println(name + " is not availabe on the menu.");
        }
    }
}
