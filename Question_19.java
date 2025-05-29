import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        System.out.println(" ++a- --b : " + chk(a, b));
        System.out.println("a-- % b++ : " + chk1(a, b));
        System.out.println("a*b=b+=5 : " + chk2(a, b));
        System.out.println("x=69>>>2 : " + chk3());
    }
    public static int chk(int a, int b){
        int result = ++a- --b;
        return result;
    }
    public static int chk1(int a, int b){
        int result = a-- % b++;
        return result;
    }
    public static int chk2(int a, int b) {
        int result = a *= b += 5;
        return result;
    }
    public static int chk3(){
        int x=69>>>2;
        return x;
    }

}
