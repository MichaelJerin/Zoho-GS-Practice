import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter BigCircle Radius: ");
        float BigRadius = in.nextFloat();
        System.out.print("Enter SmallCircle Radius: ");
        float SmallRadius = in.nextFloat();
        System.out.println(space(BigRadius, SmallRadius));
    }
    public static float space(float BigRadius, float SmallRadius){
        float R = BigRadius * BigRadius;
        float r = SmallRadius * SmallRadius;
        float space = (float) (3.1416 * (R - r));
        return space;
    }
}
