package Chap02_Expressive_Puzzlers.Puzzle09;

public class Answer {
    public static void main(String[] args) {
        short x = 0;
        int i = 123456;
        x += i; // 복합 할당 연산자: 자동 자료형 변환이 일어납니다.

        // x = x + i; 단순 할당 연산자: 오류
    }
}
