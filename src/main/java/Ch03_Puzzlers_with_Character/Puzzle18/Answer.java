package Ch03_Puzzlers_with_Character.Puzzle18;

public class Answer {

    public static void main(String[] args) throws Exception {
        byte[] bytes = new byte[256];
        for (int i = 0; i < 256; i++)
            bytes[i] = (byte) i;
        String str = new String(bytes, "ISO-8859-1" );
        for (int i = 0, n = str.length(); i < n; i++)
            System.out.print((int) str.charAt(i) + " " );
    }
}
