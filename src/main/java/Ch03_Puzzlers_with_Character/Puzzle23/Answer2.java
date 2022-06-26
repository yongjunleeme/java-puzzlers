package Ch03_Puzzlers_with_Character.Puzzle23;

import java.util.Random;

public class Answer2 {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
    }
}
