package Loop.jobsheet08;

public class Triangle1 {
    public static void main(String[] args) {
        
        for (int i = 10; 1 > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
