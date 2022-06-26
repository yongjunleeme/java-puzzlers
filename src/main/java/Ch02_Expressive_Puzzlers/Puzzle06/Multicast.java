package Ch02_Expressive_Puzzlers.Puzzle06;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);

        byte b = -1;
        char c = (char) (b & 0xff);
        System.out.println((int) c);
    }
}
