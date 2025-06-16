import java.util.Scanner;

public class Question_47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        for (char c = 'A'; c <= ch; c++){
            System.out.print(c);
        }
    }
}
