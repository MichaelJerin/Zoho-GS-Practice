import java.util.Scanner;
public class Question_41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row  = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
