package Ch03_Puzzlers_with_Character.Puzzle13;

public class Answer {

    public static void main(String[] args) {
        final String pig = "length: 10";
//        final String dog = "length: 10";
        final String dog = "length: " + pig.length();

        // 연산자 우선순위만 고려해서 고침, 인턴 고려 X
        // 인턴: 문자열을 별도 공간에 넣어 두고 활용해서 용량을 절약하는 기술
//        System.out.println("Animals are equal: " + (pig == dog));

        System.out.println("Animals are equal: " + pig.equals(dog));
    }
}
