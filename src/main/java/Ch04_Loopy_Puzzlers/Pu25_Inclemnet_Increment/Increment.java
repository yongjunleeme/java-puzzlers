package Ch04_Loopy_Puzzlers.Pu25_Inclemnet_Increment;

public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for(int i = 0; i < 100; i++)
            j = j++;
        System.out.println(j);
    }
}
