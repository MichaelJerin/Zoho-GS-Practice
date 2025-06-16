import java.util.Scanner;

public class Question_45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            for (int spc = 1; spc < i; spc++) {
                System.out.print(" ");
            }
            System.out.print(i);
            if (i != n) {
                for (int l = 1; l <= 2 * (n - i) - 1; l++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
