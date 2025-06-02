public class Question_32 {
    public static void main(String[] args) {
        int[] arr = {10, 8, 12, 7, 6};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int secondmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max != arr[i]){
                if(secondmax < arr[i]) {
                    secondmax = arr[i];
                }
            }
        }
        System.out.println(secondmax);
    }
}
