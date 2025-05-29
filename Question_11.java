import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        char ch = in.next().charAt(0);
        System.out.println(alphabets(ch));
    }
    public static String alphabets(char ch){
        ch = Character.toLowerCase(ch);
         if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
            return "Character is Vowel";
        } else{
        return "Character is Consonant";
        }
    }
}
