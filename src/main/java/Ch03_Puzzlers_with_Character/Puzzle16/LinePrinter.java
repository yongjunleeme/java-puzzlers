package chap03_chracter.Puzzle16;

public class LinePrinter {

    public static void main(String[] args) {
        // Note: \u000A // is Unicode  representation of linefeed (LF)
        // 중간에 // 이 없는 게 퍼즐 문제
        char c = 0x000A;
        System.out.println(c);
    }
}
