package Puzzle01;

public class CheckOdd {

    public static boolean badIsOdd(int i) {
        return i % 2 == 1;        
    } 

    public static boolean goodIsOdd1(int i) {
        return i % 2 != 0;
    }

    public static boolean goodIsOdd2(int i) {
        // & -> and 비트 연산자: 피연산자 양쪽 모두 1이어야만 1이 나온다. 이외에는 0
        return (i & 1) != 0;
    }

    public static void main(String[] args) {
        int i = -1; // --> true?
        
        System.out.println("isOdd(i) = " + badIsOdd(i));

        System.out.println("goodIsOdd1(i) = " + goodIsOdd1(i));

        System.out.println("goodIsOdd2(i) = " + goodIsOdd2(i));
    }
}
