import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = in.nextInt();
        int sum = sum(n);
        System.out.println("Sum : " + sum);
        int digit = digit(sum);
        System.out.println("Smallest Digit: " + digit);
    }
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int digit(int sum){
        int min = 9;
        while (sum > 0){
            int digit = sum % 10;
            if(digit < min){
                min = digit;
            }
            sum/=10;
        }

        return min;
    }
}
