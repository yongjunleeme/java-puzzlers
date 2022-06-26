package Ch03_Puzzlers_with_Character.Puzzle20;

import java.util.regex.Pattern;

public class Answer2 {

    public static void main(String[] args) {
        System.out.println(Me.class.getName().
                replaceAll(Pattern.quote("."), "/") + ".class");
    }
}
