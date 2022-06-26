package Ch03_Puzzlers_with_Character.Puzzle21;

import java.io.File;
import java.util.regex.Matcher;

public class Answer {

    public static void main(String[] args) {
        System.out.println(MeToo.class.getName().replaceAll(
                "\\.", Matcher.quoteReplacement(File.separator)) + ".class");

        System.out.println(MeToo.class.getName().
                replace(".", File.separator) + ".class");
    }
}
