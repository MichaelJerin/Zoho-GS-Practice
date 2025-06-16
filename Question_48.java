import java.util.Scanner;

public class Question_48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = n;
        int sum = 0;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        sum += num + reverse;
        System.out.println(sum);
    }
}
