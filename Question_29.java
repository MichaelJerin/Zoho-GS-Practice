import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
        System.out.println(reverse(n));
    }

    static int factorial(int n){
        int facto = 1;
        for (int i = 1; i < n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    static int reverse(int n){
        int num = factorial(n);
        int reverse = 0;
        while(num != 0){
            int dig = num % 10;
            reverse = reverse * 10 + dig;
            num = num / 10;
        }
        return reverse;
    }
}

