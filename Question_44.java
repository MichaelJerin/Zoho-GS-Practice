import java.util.Scanner;
import java.util.*;

public class Question_44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        int n = ch - 'A';

        for (char i = 'A'; i <= ch; i++) {
            for (int space = 0; space < ch - i; space++) {
                System.out.print(" ");
            }
            for (char let = 'A'; let <= i; let++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (char i = (char)(ch - 1); i >= 'A'; i--) {
            for (int space = 0; space < ch - i; space++) {
                System.out.print(" ");
            }
            for (char let = 'A'; let <=i ; let++) {
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }
}
