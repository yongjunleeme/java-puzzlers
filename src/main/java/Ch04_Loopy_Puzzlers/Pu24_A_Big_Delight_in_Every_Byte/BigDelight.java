package Ch04_Loopy_Puzzlers.Pu24_A_Big_Delight_in_Every_Byte;

public class BigDelight {
    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.println("Joy!");
        }
    }
}
