package Ch04_Loopy_Puzzlers.Pu26_In_The_Loop;

public class Answer {
    public static final Long END = 2147483647L;
    public static final Long START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (Long i = START; i <= END; i++)
            count++;
        System.out.println(count);
    }
}
