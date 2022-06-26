package Ch03_Puzzlers_with_Character.Puzzle21;

import java.io.File;

public class MeToo {

    public static void main(String[] args) {

        // 윈도우에서는 오류
        System.out.println(MeToo.class.getName()
                .replaceAll("\\.", File.separator) + ".class");
    }
}
