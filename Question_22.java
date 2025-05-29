import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int z = (++y * (y++ + 5));
        System.out.println(z);
    }
}
