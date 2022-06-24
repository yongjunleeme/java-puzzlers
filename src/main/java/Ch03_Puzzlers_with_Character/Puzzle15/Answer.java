package chap03_chracter.Puzzle15;

public class Answer {

    // 자바 컴파일러는 \\u\ 뒤에 16진수가 온다고 생각
    // 유니코드 이스케이프 시퀀스는 주석 안에 있더라도 해석되므로 반드시 형식을 지켜줘야 한다.
    public static void main(String[] args) {

        /**
         * The algorithm is due to Peter von der Ah\u00e9.
         * The algorithm is due to Peter von der Ah&eacute;.
         */

    }
}
