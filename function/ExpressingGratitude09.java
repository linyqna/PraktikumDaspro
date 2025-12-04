package function;

import java.util.Scanner;

public class ExpressingGratitude09 {
    public static String getGreetingRecipient(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = inp.nextLine();
        inp.close();
        return recipientName;
    }

    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being th ebest teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void main(String[] args) {
        sayThankyou();
    }
}
