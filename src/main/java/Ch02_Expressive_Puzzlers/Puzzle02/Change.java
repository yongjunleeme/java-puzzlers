package Ch02_Expressive_Puzzlers.Puzzle02;

import java.math.BigDecimal;

public class Change {
    public static void main(String args[]) {
        System.out.println(2.00 - 1.10);

        System.out.println(new BigDecimal("2.00")
                .subtract(new BigDecimal("1.10")));
    }
}
