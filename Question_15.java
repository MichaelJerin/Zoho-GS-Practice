import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);
        System.out.print(alphabet(ch));
    }
    public static String alphabet(char ch){
        if(ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' ||
                ch == 'h'|| ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' ||
                ch == 'o' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' ||
                ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z'){
            return "an Alphabet";
        }
        return "Not an Alphabet";
    }
}
