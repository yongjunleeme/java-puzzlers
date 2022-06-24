package chap03_chracter.Puzzle20;

import java.util.regex.Pattern;

public class Answer2 {

    public static void main(String[] args) {
        System.out.println(Me.class.getName().
                replaceAll(Pattern.quote("."), "/") + ".class");
    }
}
