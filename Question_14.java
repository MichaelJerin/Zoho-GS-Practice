import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Numeber: ");
        int n = in.nextInt();
        System.out.println(posneg(n));
    }
    public static String posneg(int n){
        if(n > 0){
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        } else{
            return "zero";
        }
    }
}
