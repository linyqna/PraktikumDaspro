package Array.Jobsheet9;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of array elemnts: ");
        int num = inp.nextInt();

        int[] arrayInt = new int[num];
        int key;
        int result = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + (i + 1) + ": ");
            arrayInt[i] = inp.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        key = inp.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result += (i + 1);
                System.out.println("The key in array is located at index position " + result);
            } else {
                System.out.println("Key not found.");
                break;
            }
        }  
    }
}
