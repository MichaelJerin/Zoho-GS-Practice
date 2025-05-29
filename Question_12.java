import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        System.out.print("Enter number3: ");
        int c = in.nextInt();
        System.out.print("Enter number4: ");
        int d = in.nextInt();
        System.out.println(greatest(a, b, c, d));
    }
    public static int greatest(int a, int b, int c, int d){
        int max = 0;
        if(a > max){
            max = a;
        }
        if(b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }
        return max;
    }

}
