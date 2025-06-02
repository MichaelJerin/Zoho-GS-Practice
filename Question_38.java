import java.util.Scanner;

public class Question_38 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Give the index of element you need to delete : ");
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();

        System.out.println("Array after deleting element: ");
        for (int i = pos; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
