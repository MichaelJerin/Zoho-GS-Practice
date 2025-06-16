import java.util.Arrays;

public class Question_51 {
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        something(arr);
    }
    public static void something(int[] arr){
        int n = arr.length;
        int[] even = new int[(n/2)+1];
        int[] odd = new int[(n/2)];
        int[] result = new int[even.length + odd.length];
        int index = 0;
        int ind = 0;
        for (int i = 0; i < arr.length; i+=2) {
            even[index] = arr[i];
            index++;
        }
        for (int i = 0; i < even.length-1; i++) {
            for (int j = 0; j < even.length - i - 1 ; j++) {
                if(even[j] < even[j+1]){
                    int temp = even[j];
                    even[j]= even[j+1];
                    even[j+1] = temp;
                }
            }
        }

        for (int i = 1; i <= arr.length-2; i+=2) {
            odd[ind] = arr[i];
            ind++;
        }
        for (int i = 0; i < odd.length-1; i++) {
            for (int j = 0; j < odd.length - i - 1 ; j++) {
                if(odd[j] > odd[j+1]){
                    int temp = odd[j];
                    odd[j]= odd[j+1];
                    odd[j+1] = temp;
                }
            }
        }

        int evenind= 0, oddind = 0;
        for (int i = 0; i <= result.length-1; i++) {
            if(i % 2 == 0){
                result[i] = even[evenind++];
            } else {
                result[i] = odd[oddind++];
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
