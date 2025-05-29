import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int n = in.nextInt();
        System.out.print("Circumference of Square: ");
        System.out.print(circumference(n));
    }
    public static int circumference(int n){
        int result = 0;
        result = 4 *  n;
        return result;
    }
}
