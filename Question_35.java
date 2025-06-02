import java.util.Arrays;

public class Question_35 {
    public static void main(String[] args) {
        int[] arr = {10, 8, 12, 7, 6};
        int n = arr.length;

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

//        System.out.println(Arrays.toString(arr1));
    }
}
