public class Question_30 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
