import java.util.Scanner;

public class Question_49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = in.nextLine();

        String reversed = reverse(str);
        System.out.println(reversed);
    }
    public static String reverse(String str){
        int space = str.indexOf(' ');

        if(space < 0){
            return str;
        }
        String rev = str.substring(0, space);
        String rem = str.substring(space + 1);
        return reverse(rem) + " " + rev;
    }
}
