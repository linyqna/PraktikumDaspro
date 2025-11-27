package loop.Jobsheet11;

import java.util.Arrays;

public class Athlete4 {
    public static void main(String[] args) {
    
        String[] badminton = {"A", "B", "C", "D", "E"};
        String[] tabtennis = {"F", "G", "H", "I", "J"};
        String[] basketbal = {"K", "L", "M", "N", "O"};
        String[] voleyball = {"P", "Q", "R", "S", "T"};

        Arrays.sort(badminton);
        Arrays.sort(tabtennis);
        Arrays.sort(basketbal);
        Arrays.sort(voleyball);

        System.out.println("----Athlete List (Ascending)----");
        System.out.println("Badminton   : " + Arrays.toString(badminton));
        System.out.println("Table Tennis: " + Arrays.toString(tabtennis));
        System.out.println("Basketball  : " + Arrays.toString(basketbal));
        System.out.println("Voleyball   : " + Arrays.toString(voleyball));
        
    }
    
}
