package Ch03_Puzzlers_with_Character.Puzzle20;

public class Me {

    public static void main(String[] args) {
        System.out.println(
                Me.class.getName().replaceAll(".", "/" ) + ".class");
    }
}
