import java.util.Scanner;

public class Question_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(evenorodd(n));
    }
    public static String evenorodd(int n){
        if(n % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
