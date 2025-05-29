import java.util.Arrays;
import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = in.nextInt();
        System.out.println("Addition");
        System.out.println(Arrays.toString(Addition(n)));
        System.out.print("Division");
        System.out.println(Arrays.toString(Division(n)));
    }
    public static int[] Addition(int n){
        int[] add = new int[10];
        for (int i = 0; i < 10; i++) {
            add[i] = i + n;
        }
        return add;
    }
    public static int[] Division(int n){
        int[] div = new int[10];
        for (int i = 0; i < 10; i++) {
            div[i] = i / n;
        }
        return div;
    }
}
