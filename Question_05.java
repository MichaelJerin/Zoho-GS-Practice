import java.util.Arrays;
import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = in.nextInt();
        System.out.println("Addition Table : ");
//        System.out.println(Arrays.toString(Addition(n)));
        Addition(n);
        System.out.println();
        System.out.println("Division Table : ");
//        System.out.println(Arrays.toString(Division(n)));
        Division(n);
    }
    public static int[] Addition(int n){
        int[] add = new int[11];
        for (int i = 1; i <= 10; i++) {
            add[i] = i + n;
            System.out.println(i + " + " + n + " = " + add[i]);
        }
        return add;
    }
    public static int[] Division(int n){
        int[] div = new int[11];
        for (int i = 1; i <= 10; i++) {
            div[i] = i / n;
            System.out.println(i + " / " + n + " = " + div[i]);
        }
        return div;
    }
}
