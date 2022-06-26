package Ch03_Puzzlers_with_Character.Puzzle23;

import java.util.Random;

public class Answer3 {
    public static void main(String[] args) {
        String a[] = {"Main", "Pain", "Gain"};
        System.out.println(randomElement(a));
    }

    private static Random rnd = new Random();
    private static String randomElement(String[] a) {
        return a[rnd.nextInt(a.length)];
    }
}
