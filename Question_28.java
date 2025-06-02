import java.util.Arrays;

public class Question_28 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 5, 6, 4};

        int n = arr.length;
        int min = arr[0];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        int i = 0; int j = n-1;
        while(arr[i] <= arr[j]){
            if(arr[i] == arr[j]){
                System.out.println(arr[i]);
                break;
            }
            else{
                System.out.print(arr[i]);
                System.out.print(arr[j]);
                i++;
                j--;
            }
        }
    }
}
