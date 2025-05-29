import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = in.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = in.nextInt();
        System.out.println("Quotient: " + quotient(dividend, divisor));
        System.out.println("Reminder: " + reminder(dividend, divisor));
    }
    public static int quotient(int dividend, int divisor){
        int quo = dividend / divisor;
        return quo;
    }

    public static int reminder(int dividend, int divisor) {
        int rem = dividend % divisor;
        return rem;
    }
}
