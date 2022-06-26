package Ch03_Puzzlers_with_Character.Puzzle11;

public class Answer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.println(sb);

        System.out.println(String.valueOf('H') + 'a');

        System.out.println("" + 'H' + 'a');

        System.out.println("2 + 2 =" + 2+2);

        System.out.printf("%c%c", 'H', 'a');
    }
}
