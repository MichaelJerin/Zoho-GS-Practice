import java.util.Scanner;

public class Question_46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Start : ");
        int start = in.nextInt();
        System.out.print("End : ");
        int end = in.nextInt();

        for (int i = start; i <= end ; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
