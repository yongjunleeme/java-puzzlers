package Chap02_Expressive_Puzzlers.Puzzle10;

public class Answer {

    public static void main(String[] args) {
        Object x = "buy";
        String i = "Effective Java";

        x = x + i;
        x += i;
    }
}
