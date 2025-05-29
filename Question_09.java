import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.println("Swaped");
        System.out.println(swap(a, b));

    }
    public static int swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        return 0;
    }
}
