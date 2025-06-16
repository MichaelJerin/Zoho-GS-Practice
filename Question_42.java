import java.util.Scanner;

public class Question_42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row  = in.nextInt();

        for (int i = 1; i <= row; i++) {
            int v = 1;
            for (int j = row; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(v++ + " ");
            }
            System.out.println();
        }
    }
}
