import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = in.nextInt();
        x = ++x*2 + 3*-x;
        System.out.println(x);
    }
}
