package function.Jobsheet14;

public class SummationRecursive {
    static int sumRecursive(int n) {
        if (n == 0) return 0; // base case
        return n + sumRecursive(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int result = sumRecursive(8);
        System.out.println("Summation result = " + result);
    }
}
