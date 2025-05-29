import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int len = in.nextInt();
        System.out.print("Enter Width: ");
        int wid = in.nextInt();
        System.out.println("Perimeter of rectangle is " + rectangle(len, wid));
    }
    public static int rectangle(int len, int wid){
        int result = 0;
        result = 2 * ( len + wid );
        return result;
    }
}
