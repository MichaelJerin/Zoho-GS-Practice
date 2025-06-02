public class Question_33 {
    public static void main(String[] args) {
        int[] arr = {10, 8, 12, 7, 6, 2};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        int secondmin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(min != arr[i]){
                if(secondmin > arr[i]){
                    secondmin = arr[i];
                }
            }
        }
        System.out.println(secondmin);
    }
}
