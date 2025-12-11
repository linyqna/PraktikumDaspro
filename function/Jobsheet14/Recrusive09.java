package function.Jobsheet14;

public class Recrusive09 {
    static int factorialRecrusive(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecrusive(n - 1);
        }
    }

    static int factorialLiterative(int n){
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * 1;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println(factorialRecrusive(5));
        System.out.println(factorialLiterative(5));
    }
}
