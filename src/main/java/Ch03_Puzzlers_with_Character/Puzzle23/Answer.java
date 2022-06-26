package Ch03_Puzzlers_with_Character.Puzzle23;

import java.util.Random;

public class Answer {
    private static Random rnd = new Random();

    public static void main(String[] args) {

        StringBuffer word = null;

        // rnd.nextInt(int) : 0 이상 int 미만의 랜덤한 정수를 리턴
        // swith 조건문 내부 case문에서 break를 사용하지 않으면 해당 값과 아래 있는 코드를 모두 실행
        // new StringBuffer('M') : StringBuffer(char) 생성자는 존재하지 않음
       switch (rnd.nextInt(3)) {
            case 1:
                word = new StringBuffer("P");
                break;
            case 2:
                word = new StringBuffer("G");
                break;
            default:
                word = new StringBuffer("M");
                break;
        }

        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
