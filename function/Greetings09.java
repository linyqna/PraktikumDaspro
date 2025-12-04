package function;

import java.util.Scanner;

public class Greetings09 {
    public static String getGreetingRecipient() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = inp.nextLine();
        inp.close();
        return recipientName;
    }

    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + ", may the force be with you!");
    }
}
