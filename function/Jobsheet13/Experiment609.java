package function.Jobsheet13;

import java.util.Scanner;

public class Experiment609 {
    static int calculateArea (int l, int w){
        int area = l * w;
        return area;
    }
    static int calculateVolume (int l, int w, int h){
        int vol = calculateArea(l, w) * h;
        return vol;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Input length = ");
        p = inp.nextInt();
        System.out.print("Input wide = ");
        l = inp.nextInt();
        System.out.print("Input high = ");
        t = inp.nextInt();

        L = p * l;
        System.out.println("Area of the rectangle = " + L);
        vol = p * l * t;
        System.out.println("Volume of the rectangle = " + vol);
    }
}
