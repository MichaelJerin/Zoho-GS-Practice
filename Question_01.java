import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = in.nextInt();
        System.out.print("The Binary Value is: ");
        System.out.println(binary(num));
        System.out.print("The Octal Value is: ");
        System.out.println(octal(num));
        System.out.print("The HexaDecimal Value is: ");
        System.out.println(hexa(num));
    }

    public static String binary(int num){
        if(num == 0) return "0";
        String result = "";
        while (num > 0){
            result = result + (num % 2);
            num/=2;
        }
        return result;
    }
    public static String octal(int num){
        if(num == 0) return "0";
        String result = "";
        while (num > 0){
            result =  (num % 8) + result;
            num/=8;
        }
        return result;
    }
    public static String hexa(int num){
        if(num == 0) return "0";
        String result = "";
        char[] ch = "0123456789ABCDEF".toCharArray();
        while (num > 0){
            result = ch[num % 16] + result;
            num /= 16;
        }
        return result;
    }
}
