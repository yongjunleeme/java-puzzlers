package Ch02_Expressive_Puzzlers.Puzzle05;

public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabe)
        );

        System.out.println("0xcafebabe = " + 0xcafebabe);
    }
}
