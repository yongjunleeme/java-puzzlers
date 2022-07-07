package Ch04_Loopy_Puzzlers.Pu27_Shifty;

public class Answer {
    public static void main(String[] args) {
        int distance = 0;
        for (int val = -1; val != 0; val <<= 1) {
            System.out.println(val);
            System.out.println(distance);
            distance++;
        }
        System.out.println(distance);
    }
}
