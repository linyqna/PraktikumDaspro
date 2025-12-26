package function.Jobsheet14;

public class DescendingSequenceRecursive {
    // Recursive
    static void printRecursive(int n) {
        if (n < 0) return; // base case
        System.out.print(n + " ");
        printRecursive(n - 1); // recursive call
    }

    // Iterative
    static void printIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Recursive:");
        printRecursive(5);
        System.out.println("\nIterative:");
        printIterative(5);
    }
}
