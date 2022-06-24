package Chap02_Expressive_Puzzlers.Puzzle05;

public class Answer {
    public static void main(String[] args) {
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL)
        );
    }
}
