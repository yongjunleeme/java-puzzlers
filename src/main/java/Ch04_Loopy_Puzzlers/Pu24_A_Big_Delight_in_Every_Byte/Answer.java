package Ch04_Loopy_Puzzlers.Pu24_A_Big_Delight_in_Every_Byte;

public class Answer {

    private static final byte TARGET = (byte)0x90;

    public static void main(String[] args) {
        
        // 0x90 : int +144
        // 0x90 : byte -112
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == TARGET)
                System.out.println("Joy!");
        }
    }
}
