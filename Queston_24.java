import java.util.Scanner;

public class Queston_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int x= in.nextInt();
        int x1 = ++x - x++ + -x;
        System.out.println(x1);
    }
}
