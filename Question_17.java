import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        int max;
        max = (a > b) ? a : b;
        System.out.println("Largest is " + max);
    }
}
