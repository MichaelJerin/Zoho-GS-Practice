import java.util.Scanner;

public class Question_58 {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number 1 Size: ");
        int size = in.nextInt();
        int count = 0;
        long result = 0;
        while (count < size){
            count++;
            int temp = in.nextInt();
            result = (result * 10) + temp;
        }
        System.out.println(result);

        System.out.println("Enter Number 2 size : ");
        int size2 = in.nextInt();
        int count2 = 0;
        long result2 = 0;
        while(count2 < size2){
            count2++;
            int temp = in.nextInt();
            result2 = (result2 * 10) + temp;
        }
        System.out.println(result2);

        long few = result + result2;
        System.out.println("Sum of number1 and number2 : " + few);
    }
}
