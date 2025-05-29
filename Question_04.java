import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter radius: ");
            int radius = in.nextInt();
            System.out.print("Enter height: ");
            int height = in.nextInt();
            System.out.println("Perimeter of Cylinder is " + cylinder(radius, height));
    }
    public static double cylinder(int radius, int height){
        double result = 0;
        result = 2 * 3.1416 * radius * height;
        return result;
    }
}
